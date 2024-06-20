package edu.atria.java.arrays;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student arr[]= new Student[5];
		arr[0]= new Student(11,"Rohith");
		arr[1]= new Student(12,"Rahul");
		arr[2]= new Student(13,"Ravin");
		arr[3]= new Student(14,"Rishi");
		arr[4]= new Student(15,"Ravina");
		
		for(Student s:arr) {
			System.out.print("The age of the student is:" +s.getAge() + " ");
			System.out.println("The name of the student is:" +s.getName());
		}
		

	}

}
