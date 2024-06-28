package Assignment;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean loop=true;
		while(loop) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the choice");
		int ch=sc.nextInt();
		switch(ch){
		case 1: System.out.println("Insert");
		break;
		case 2: System.out.println("Select all the Employee");
		break;
		case 3: System.out.println("Select a employee id");
		break;
		case 4: System.out.println("Delete Employee");
		break;
		case 5: System.out.println("Update Employee");
		break;
		case 6: System.out.println("exit from the application");
		loop=false;
		break;
		default: System.out.println("Incorrect choice, Please enter a valid choice");
		break;
		}
		}
	}
}


