package edu.atria.java.inheritance;

public class Student extends Citizen{
	private int studentId;
	private String name;
	private String department;
	private String proctor;
	
	//constructor
	public Student(long aadharNo, long voterid, String nationality, int studentId, String name, String department,
			String proctor) {
		super(aadharNo, voterid, nationality);
		this.studentId = studentId;
		this.name = name;
		this.department = department;
		this.proctor = proctor;
	}

	//getters and setters
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getProctor() {
		return proctor;
	}

	public void setProctor(String proctor) {
		this.proctor = proctor;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", department=" + department + ", proctor="
				+ proctor + ", getAadharNo=" + getAadharNo() + ", getVoterid=" + getVoterid()
				+ ", getNationality=" + getNationality() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	
	
	
	

}
