package edu.atria.java.inheritance;

public class Employee extends Citizen {
	private int empid;
	private String name;
	private String designation;
	private double salary;
	
	public Employee(long aadharNo, long voterid, String nationality, int empid, String name, String designation,
			double salary) {
		super(aadharNo, voterid, nationality);
		this.empid = empid;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", designation=" + designation + ", salary=" + salary
				+ ", getAadharNo=" + getAadharNo() + ", getVoterid=" + getVoterid() + ", getNationality="
				+ getNationality() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	

	

}
