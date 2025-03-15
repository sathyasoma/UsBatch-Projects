package com.java.coding.interview;
/*
 * Can you implement a priority queue for a hospital's emergency room?   
 * 
 *  Design a class to manage a hospital's patient queue system.
 *   The system should be able to add patients with different priority
 *    levels and always return the patient with the highest priority 
 *    for treatment
 * */
import java.util.PriorityQueue;

public class HospitalQueue {
    
    // Inner class to represent a patient
    static class Patient implements Comparable<Patient> {
        String name;
        int priority; // Higher value means higher priority

        Patient(String name, int priority) {
            this.name = name;
            this.priority = priority;
        }

        @Override
        public int compareTo(Patient other) {
            // Higher priority patients should come first
            return Integer.compare(other.priority, this.priority);
        }

        @Override
        public String toString() {
            return name + " (Priority: " + priority + ")";
        }
    }

    private PriorityQueue<Patient> queue;

    public HospitalQueue() {
        // Initialize the priority queue with a max-heap
        this.queue = new PriorityQueue<>();
    }

    // Add a patient to the queue
    public void addPatient(String name, int priority) {
        Patient patient = new Patient(name, priority);
        queue.offer(patient);
    }

    // Get the patient with the highest priority
    public Patient getNextPatient() {
        return queue.poll();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        HospitalQueue hospitalQueue = new HospitalQueue();

        // Adding patients with different priorities
        hospitalQueue.addPatient("John Doe", 2);
        hospitalQueue.addPatient("Jane Smith", 5);
        hospitalQueue.addPatient("Alice Brown", 3);

        // Retrieve and print patients based on priority
        while (!hospitalQueue.isEmpty()) {
            System.out.println("Next patient for treatment: " + hospitalQueue.getNextPatient());
        }
    }
}

