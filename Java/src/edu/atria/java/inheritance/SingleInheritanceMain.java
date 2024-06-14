package edu.atria.java.inheritance;

public class SingleInheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employee eOne= new Employee(211234556, 13243455, "Indian", 121, "Rahul", "Front end developer", 400000.00);
		
		Citizen eTwo= new Employee(54565765,6567776,"Indian", 131,"Ravi","tester", 50000.00);
		System.out.println(eTwo);
		
		//Hierarchial inheritance
		Citizen sOne = new Student(12564343,23454654,"Indian",101,"Rohith", "CSE", "Rahul");
		System.out.println(sOne);
		

	}

}
