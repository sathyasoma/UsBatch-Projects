package com.java.coding.interview;
/*
 * How would you find the shortest connection between two users in a social network?   
 * 
 * Explanation:
 * -----------
 *  Design a class to represent a social network.
 *   Implement methods to add connections between users and 
 *   find the shortest connection path between any two users.
 * 
 * 
 * */
import java.util.*;

public class SocialNetwork {
    
    // Inner class to represent a social network
    private static class Graph {
        private Map<String, List<String>> adjacencyList;
        
        public Graph() {
            this.adjacencyList = new HashMap<>();
        }
        
        // Add a connection between two users
        public void addConnection(String user1, String user2) {
            adjacencyList.putIfAbsent(user1, new ArrayList<>());
            adjacencyList.putIfAbsent(user2, new ArrayList<>());
            adjacencyList.get(user1).add(user2);
            adjacencyList.get(user2).add(user1);
        }
        
        // Find the shortest path between two users
        public List<String> findShortestPath(String startUser, String endUser) {
            if (startUser.equals(endUser)) {
                return Collections.singletonList(startUser);
            }
            
            Queue<String> queue = new LinkedList<>();
            Map<String, String> parentMap = new HashMap<>();
            Set<String> visited = new HashSet<>();
            
            queue.add(startUser);
            visited.add(startUser);
            parentMap.put(startUser, null);
            
            while (!queue.isEmpty()) {
                String currentUser = queue.poll();
                
                for (String neighbor : adjacencyList.getOrDefault(currentUser, Collections.emptyList())) {
                    if (!visited.contains(neighbor)) {
                        queue.add(neighbor);
                        visited.add(neighbor);
                        parentMap.put(neighbor, currentUser);
                        
                        if (neighbor.equals(endUser)) {
                            return reconstructPath(startUser, endUser, parentMap);
                        }
                    }
                }
            }
            
            return Collections.emptyList(); // Return empty list if no path exists
        }
        
        // Reconstruct the path from startUser to endUser
        private List<String> reconstructPath(String startUser, String endUser, Map<String, String> parentMap) {
            List<String> path = new ArrayList<>();
            for (String at = endUser; at != null; at = parentMap.get(at)) {
                path.add(at);
            }
            Collections.reverse(path);
            return path;
        }
    }
    
    public static void main(String[] args) {
        Graph network = new Graph();
        
        // Add connections
        network.addConnection("Alice", "Bob");
        network.addConnection("Bob", "Charlie");
        network.addConnection("Charlie", "David");
        network.addConnection("David", "Eve");
        network.addConnection("Alice", "Eve");
        
        // Find shortest path between users
        List<String> path = network.findShortestPath("Alice", "David");
        
        System.out.println("Shortest path from Alice to David: " + path);
    }
}

