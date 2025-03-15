package com.exceptions;

import java.util.Scanner;

class InvalidTemperatureException extends Exception {
    public InvalidTemperatureException(String message) {
        super(message);
    }
}
public class TemperatureMonitor {
	private double temperature;
    private static final double MIN_SAFE_TEMPERATURE = 0.0;
    private static final double MAX_SAFE_TEMPERATURE = 35.0;

    public TemperatureMonitor(double initialTemperature) {
        this.temperature = initialTemperature;
    }

    public void setTemperature(double temperature) throws InvalidTemperatureException {
        if (temperature < MIN_SAFE_TEMPERATURE || temperature > MAX_SAFE_TEMPERATURE) {
            throw new InvalidTemperatureException("Temperature out of safe range: " + temperature);
        } else {
            this.temperature = temperature;
            System.out.println("Temperature set to: " + temperature);
        }
    }

    public double getTemperature() {
        return temperature;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TemperatureMonitor monitor = new TemperatureMonitor(20.0); // Initial temperature of 20.0 degrees

        System.out.println("Initial temperature: " + monitor.getTemperature());

        System.out.print("Enter new temperature: ");
        double newTemperature = scanner.nextDouble();

        try {
            monitor.setTemperature(newTemperature);
            System.out.println("New temperature: " + monitor.getTemperature());
        } catch (InvalidTemperatureException e) {
            System.out.println("InvalidTemperatureException: " + e.getMessage());
        }

        scanner.close();
    }
}
