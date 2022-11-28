package mbb64_Lab9;

public class Cylinder extends Circle {
	private double height;

	public Cylinder() {
		super();
		this.height = 1.0;
	}

	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}

	public Cylinder(double radius, double height, String color) {
		super(radius, color);
		this.height = height;

	}

	public double getHeight() {
		return this.height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getVolume() {
		return (super.getArea() * this.height);
	}

}
