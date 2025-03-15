package com.java.coding.interview;
/*
 * Can you create a task scheduler that respects dependencies?   
 *  
 *  Explanantion:
 *  -----------
 *  Implement a method to schedule tasks with dependencies. 
 *  Given a list of tasks and their dependencies, return a 
 *  valid execution order that ensures all dependencies are met.
 * */
import java.util.*;

public class TaskScheduler {
    
    public static List<String> scheduleTasks(List<String> tasks, List<int[]> dependencies) {
        Map<String, List<String>> graph = new HashMap<>();
        Map<String, Integer> inDegree = new HashMap<>();
        
        // Initialize the graph and in-degrees
        for (String task : tasks) {
            graph.put(task, new ArrayList<>());
            inDegree.put(task, 0);
        }
        
        // Build the graph and in-degree map
        for (int[] dep : dependencies) {
            String task = tasks.get(dep[0]);
            String dependency = tasks.get(dep[1]);
            graph.get(dependency).add(task);
            inDegree.put(task, inDegree.get(task) + 1);
        }
        
        // Initialize the queue with nodes having zero in-degree
        Queue<String> queue = new LinkedList<>();
        for (String task : tasks) {
            if (inDegree.get(task) == 0) {
                queue.add(task);
            }
        }
        
        List<String> executionOrder = new ArrayList<>();
        
        while (!queue.isEmpty()) {
            String currentTask = queue.poll();
            executionOrder.add(currentTask);
            
            for (String neighbor : graph.get(currentTask)) {
                inDegree.put(neighbor, inDegree.get(neighbor) - 1);
                if (inDegree.get(neighbor) == 0) {
                    queue.add(neighbor);
                }
            }
        }
        
        // Check if we could include all tasks in the execution order
        if (executionOrder.size() != tasks.size()) {
            return Collections.singletonList("Cycle detected. No valid order.");
        }
        
        return executionOrder;
    }

    public static void main(String[] args) {
        List<String> tasks = Arrays.asList("A", "B", "C", "D");
        List<int[]> dependencies = Arrays.asList(
            new int[]{1, 0}, // B depends on A
            new int[]{2, 0}, // C depends on A
            new int[]{3, 1}, // D depends on B
            new int[]{3, 2}  // D depends on C
        );

        System.out.println("Execution order: " + scheduleTasks(tasks, dependencies));
    }
}

