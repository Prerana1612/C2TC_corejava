package edu.atria.java.finalkeyword;

public class FinalVariable {
	//final int x; //final instance  variable should be initialised 
	final int x=100;
	
	//declare a static blank final variable
	final static int y;
	
	final static int z=10;
	
	void change() {
		//x=30; //final variable can't be reassigned 
		//y=200; //final static variable can't be reassigned 
		
	}

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + "]";
	}
	static {
		y=20;
		//z=100; //once initialized cannot be reassigned 
		System.out.println("value of y:"+y);
	}

}
