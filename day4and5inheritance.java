package Assigment1;

import java.lang.reflect.Type;

public class day4and5inheritance {
	public class Shape {
	    public double area() {
	        return 0.0;
	    }
	}

	class Circle extends Shape {
	    private double radius;

	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    @Override
	    public double area() {
	        return Math.PI * radius * radius;
	    }
	}

	class Rectangle extends Shape {
	    private double length;
	    private double width;

	    public Rectangle(double length, double width) {
	        this.length = length;
	        this.width = width;
	    }

	    @Override
	    public double area() {
	        return length * width;
	    }
	}

	class Main {
	    public static void main(String[] args) {
	        Circle circle = new Circle(5);
	        System.out.println("Area of the circle: " + circle.area());

	        Rectangle rectangle = new Rectangle(4, 6);
	        System.out.println("Area of the rectangle: " + rectangle.area());
	    }
	}


}
