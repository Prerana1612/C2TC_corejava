package edu.atria.java.abstraction;

public class Rectangle extends Square{
	float length, breadth;

	public Rectangle(float length, float breadth) {
		super(breadth);
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	public float calculateArea() {
		return area=length * breadth;
	}
}
