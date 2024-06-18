package edu.atria.java.polymorphism;

public class Rbi {
	public float getRI() {
		return 7.0f;
	}
}


/* 1)While overriding child class method signature and parent class method signatures must be same otherwise we are getting compilation error.
 * 2)The return types of overridden method and overriding method must be same.
 * 3)While overriding the methods its possible to maintain same level permission or increasing order but not decreasing order, if you are trying to reduce the permission compiler generates error message "Attempting to assign weaker access privileges".
 * 4)Final methods are preventing overriding.
 * 5)Static methods are bounded with class hence we are unable to override static methods.*/

