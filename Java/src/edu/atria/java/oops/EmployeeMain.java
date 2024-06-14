package edu.atria.java.oops;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		/*
		 * Scanner sc =new Scanner (System.in);
		 * System.out.println("Enter the employee details"); int id=sc.nextInt(); String
		 * name=sc.next(); double salary= sc.nextDouble(); String designation=sc.next();
		 */

		// create default constructors
		// className objName = new className();
		/*
		 * Employee eOne=new Employee(); System.out.println(eOne);
		 */

		Employee eTwo = new Employee(101, "Rahul", 56000.00, "Developer");
		System.out.println(eTwo);
		/*
		 * eOne.setEmp_id(id); eOne.setName(name); eOne.setSalary(salary);
		 * eOne.setDesignation(designation);
		 * 
		 * System.out.println("printing the Employee id:"+eOne.getEmp_id());
		 * System.out.println("printing the Employee name:"+eOne.getName());
		 * System.out.println("printing the Employee Salary:"+eOne.getSalary());
		 * System.out.println("printing the Employee Designation:"+eOne.getDesignation()
		 * );
		 */

	}

}
