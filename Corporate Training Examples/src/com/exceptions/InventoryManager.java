package com.exceptions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class InsufficientInventoryException extends Exception {
    public InsufficientInventoryException(String message) {
        super(message);
    }
}
public class InventoryManager {
    private Map<String, Integer> inventory = new HashMap<>();

    public void addItem(String item, int quantity) {
        inventory.put(item, inventory.getOrDefault(item, 0) + quantity);
        System.out.println("Added " + quantity + " of " + item + " to inventory.");
    }

    public void removeItem(String item, int quantity) throws InsufficientInventoryException {
        if (!inventory.containsKey(item)) {
            throw new InsufficientInventoryException("Item not found: " + item);
        } else if (inventory.get(item) < quantity) {
            throw new InsufficientInventoryException("Insufficient inventory for " + item + ". Available: " + inventory.get(item));
        } else {
            inventory.put(item, inventory.get(item) - quantity);
            System.out.println("Removed " + quantity + " of " + item + " from inventory.");
        }
    }

    public void displayInventory() {
        System.out.println("Current Inventory:");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InventoryManager manager = new InventoryManager();

        manager.addItem("Laptop", 10);
        manager.addItem("Phone", 20);
        manager.displayInventory();

        System.out.print("Enter item to remove: ");
        String item = scanner.nextLine();

        System.out.print("Enter quantity to remove: ");
        int quantity = scanner.nextInt();

        try {
            manager.removeItem(item, quantity);
        } catch (InsufficientInventoryException e) {
            System.out.println("InsufficientInventoryException: " + e.getMessage());
        }

        manager.displayInventory();
        scanner.close();
    }
}
