package edu.atria.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List list = new List();   cannot instantiate list interface 
		List li= new ArrayList();
		System.out.println("elements in the list:"+li);
		li.add(1);
		li.add("Address");
		li.add(true);
		li.add(98.5f);
		System.out.println("elements in the list:"+li);
		li.add(null);
		System.out.println("elements in the list:"+li);
		//duplicate elements
		li.add("Address");
		System.out.println("elements in the list:"+li);
	}

}
