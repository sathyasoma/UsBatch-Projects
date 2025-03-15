package com.java.coding.interview;
/*
 * Can you find available time slots given a list of scheduled meetings?    
 * Explanation:
 * -------------
 * Create a function that takes a list of time intervals 
 * representing meeting schedules and returns a list of free 
 * time slots.
 * */
import java.util.*;

public class MeetingScheduler {
    
    public static List<int[]> findFreeTimeSlots(int[][] meetings, int workdayStart, int workdayEnd) {
        // Step 1: Sort meetings by start time
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));
        
        // Step 2: Merge overlapping intervals
        List<int[]> mergedMeetings = new ArrayList<>();
        for (int[] meeting : meetings) {
            if (mergedMeetings.isEmpty() || mergedMeetings.get(mergedMeetings.size() - 1)[1] < meeting[0]) {
                mergedMeetings.add(meeting);
            } else {
                mergedMeetings.get(mergedMeetings.size() - 1)[1] = Math.max(mergedMeetings.get(mergedMeetings.size() - 1)[1], meeting[1]);
            }
        }
        
        // Step 3: Find free time slots
        List<int[]> freeSlots = new ArrayList<>();
        int previousEnd = workdayStart;
        
        for (int[] meeting : mergedMeetings) {
            if (previousEnd < meeting[0]) {
                freeSlots.add(new int[]{previousEnd, meeting[0]});
            }
            previousEnd = Math.max(previousEnd, meeting[1]);
        }
        
        // Check for free slot after the last meeting
        if (previousEnd < workdayEnd) {
            freeSlots.add(new int[]{previousEnd, workdayEnd});
        }
        
        return freeSlots;
    }
    
    public static void main(String[] args) {
        int[][] meetings = {
            {9, 10},
            {11, 12},
            {13, 14},
            {15, 16}
        };
        int workdayStart = 8;
        int workdayEnd = 17;
        
        List<int[]> freeSlots = findFreeTimeSlots(meetings, workdayStart, workdayEnd);
        
        System.out.println("Free time slots:");
        for (int[] slot : freeSlots) {
            System.out.printf("[%d, %d]%n", slot[0], slot[1]);
        }
    }
}

