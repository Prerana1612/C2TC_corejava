package edu.atria.java.statickeyword;

public class MyClass {
	private int section;//nonstatic
	private static int srNo; //static
	
	//static block
	static {
		System.out.println("within the static block....");
		srNo=1000;
		
	}
	MyClass(){
		System.out.println("within default constructor...");
		srNo++;
	}
	
	//static method 
	public static void display() {
		System.out.println(srNo);
		//System.out.println(section);//its not static 
	}

	@Override
	public String toString() {
		return "MyClass [section=" + section + "]";
	}
	
}
