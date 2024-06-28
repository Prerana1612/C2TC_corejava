package edu.atria.java.collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> li= new LinkedList();
		li.add(10);
		li.add(20);
		li.add(30);
		System.out.println("Number in the list are:"+li);
		li.add(1,15);
		System.out.println("Number in the list are:"+li);
		//li.add(7,15);//IndexOutOfBoundsException if index is negative or greater than size
		//adding elements
		li.addFirst(0);
		li.addLast(40);
		System.out.println("Number in the list are:"+li);
		//retrieving elements
		System.out.println("first element is:"+li.getFirst());
		System.out.println("first element is:"+li.getLast());
		//removing elements
		li.removeFirst();
		li.removeLast();
		System.out.println("Number in the list are:"+li);
		//it is not synchronised means it isnot thread safe
		//uses doublylinked list data structure
		
	}

}
