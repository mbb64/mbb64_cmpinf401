package mbb64_Lab9;

public class Circle {
	private double radius;
	private String color;

	public Circle() {
		this.radius = 5.0;
		this.color = "Green";
	}

	public Circle(double radius) {
		this.radius = radius;
		this.color = "Green";
	}

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getArea() {
		return (Math.PI * radius * radius);

	}

}
