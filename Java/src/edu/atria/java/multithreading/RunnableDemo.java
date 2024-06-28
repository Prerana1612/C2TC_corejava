package edu.atria.java.multithreading;

public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UsingRunnable(30,20,"Hello");
		/*
		 * Another way of creating thread using runnable
		 * Thread t1=new Thread(new UsingRunnable(10,1,"First"));
		 *  Thread t2=new Thread(new UsingRunnable(5,1,"Second"));
		 *  t1.start();
		 *  t2.start();
		 */
		System.out.println("---------------------");

	}

}
