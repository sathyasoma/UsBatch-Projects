package com.abstraction;

abstract class Shape {
	abstract void draw();
}

class Circle extends Shape {
	@Override
	void draw() {
		System.out.println("Drawing Circle");
	}
}

class Rectangle extends Shape {
	@Override
	void draw() {
		System.out.println("Drawing Rectangle");
	}
}

public class Main1 {
	public static void main(String[] args) {
		Shape circle = new Circle();
		Shape rectangle = new Rectangle();

		circle.draw();
		rectangle.draw();
	}
}
