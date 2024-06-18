package edu.atria.java.abstraction;

public class AbstractClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cannot instantiate abstract class shape
		//Shape s= new Shape(2.0f);
		
		Shape sOne = new Square(2.5f);
		sOne.calculateArea();
		sOne.display();
		
		Shape sTwo = new Rectangle(7,5.5f);
		sTwo.calculateArea();
		sTwo.display();
		
		

	}

}
