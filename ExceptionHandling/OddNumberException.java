Throw Exception for Odd Number

Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.

import java.util.*;
public class ExceptionHandling1{
	public static void main(String[] args) throws OddNumberException{
		int n=21;
		if (n%2!=0){
			throw new OddNumberException("You have entered an Odd Number");

		}

	}
}
class OddNumberException extends Exception{
	OddNumberException(String message){
		super(message);
	}
}
