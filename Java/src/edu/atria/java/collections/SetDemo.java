package edu.atria.java.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set s=new Set(); //cannot instantiate set interface
		
		//Set s= new HashSet();//insertion order is not maintained using HashSet 
		//Set s= new LinkedHashSet();//insertion order is maintained
		Set<Integer> s = new TreeSet();//accepts only homogeneous datatype
		System.out.println("The elements in set:" +s);
		s.add(1);
		/*s.add(true);
		s.add("java");
		s.add("Spring boot");
		s.add(89.5);*/
		s.add(10);
		s.add(12);
		s.add(2);
		System.out.println("The elements in set:" +s);
		/*s.add("java");//duplicates are not accepted for set interface
		System.out.println("The elements in set:" +s); */
	}
}
