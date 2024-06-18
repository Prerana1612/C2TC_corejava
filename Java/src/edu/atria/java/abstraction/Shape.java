package edu.atria.java.abstraction;

//An abstract class can have both abstract and non abstract methods
public abstract class Shape {
	//static float area;
	float area;
	//abstract method
	public abstract float calculateArea();
	
	//non abstract method
	
	/* public static final void display() {
	 	System.out.println("Area of the shape:" +area);
	 }*/
	
	public void display() {
		System.out.println("Area of the shape:" + area);
	}
}
