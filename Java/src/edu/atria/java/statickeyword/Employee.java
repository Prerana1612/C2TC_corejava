package edu.atria.java.statickeyword;

public class Employee {
	//instance variable
	private int empId;
	private String empName;
	
	//static or class variable 
	private static String company="IBM";

	//consructors
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	//getters and setters
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public static String getCompany() {
		return company;
	}

	public static void setCompany(String company) {
		Employee.company = company;
	}

	//tostring
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "company=" +"company]";
	}
}
