package edu.atria.java.interfacedemo;

public class SimMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sim s= new Sim();   cannot create object for interface
		
		Sim sOne = new Jio();//loose coupling
		sOne.makeCall();
		sOne.sendMsg();
		
		
		Sim sTwo = new Airtel();
		sTwo.makeCall();
		sTwo.sendMsg();

	}

}
