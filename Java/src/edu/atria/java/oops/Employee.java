//program to demonstrate classes and objects , constructors

package edu.atria.java.oops;

//class
public class Employee {
	// data members
	private int emp_id;
	private String name;
	private double Salary;
	private String Designation;

	// parameterized constructors
	public Employee(int emp_id, String name, double salary, String designation) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.Salary = salary;
		this.Designation = designation;
	}

	// getters and setters
	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", name=" + name + ", Salary=" + Salary + ", Designation=" + Designation
				+ "]";
	}

}
