package com.java.coding.interview;
//Q:How would you merge multiple sorted customer lists?   
/* 
 * Explanantion:
 * Implement a method to merge multiple sorted arrays of customer 
 * IDs into a single sorted array. Each array represents a 
 * different loyalty tier, and we need to combine them for a 
 * unified mailing list.
 */
import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.List;

public class MergeSortedArrays {
    
    static class Element {
        int value;
        int arrayIndex;
        int elementIndex;
        
        Element(int value, int arrayIndex, int elementIndex) {
            this.value = value;
            this.arrayIndex = arrayIndex;
            this.elementIndex = elementIndex;
        }
    }
    
    public static int[] mergeSortedArrays(List<int[]> arrays) {
        if (arrays == null || arrays.isEmpty()) {
            return new int[0];
        }

        // Priority queue to store the smallest element from each array
        PriorityQueue<Element> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a.value, b.value));

        // Initialize the priority queue with the first element from each array
        for (int i = 0; i < arrays.size(); i++) {
            int[] array = arrays.get(i);
            if (array.length > 0) {
                minHeap.offer(new Element(array[0], i, 0));
            }
        }

        List<Integer> resultList = new ArrayList<>();

        // Merge all arrays
        while (!minHeap.isEmpty()) {
            Element smallest = minHeap.poll();
            resultList.add(smallest.value);

            // Get the next element from the same array, if any
            int nextIndex = smallest.elementIndex + 1;
            if (nextIndex < arrays.get(smallest.arrayIndex).length) {
                minHeap.offer(new Element(arrays.get(smallest.arrayIndex)[nextIndex], smallest.arrayIndex, nextIndex));
            }
        }

        // Convert resultList to an int array
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        
        return result;
    }

    public static void main(String[] args) {
        List<int[]> customerLists = new ArrayList<>();
        customerLists.add(new int[]{1, 4, 7});
        customerLists.add(new int[]{2, 5, 8});
        customerLists.add(new int[]{3, 6, 9});

        int[] mergedList = mergeSortedArrays(customerLists);
        
        // Print merged list
        for (int id : mergedList) {
            System.out.print(id + " ");
        }
    }
}

