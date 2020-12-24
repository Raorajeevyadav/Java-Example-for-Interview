package java_questions;

import java.util.Scanner;

public class Add_Two_Number {

	public static void main(String[] args) {
	
		
		//normal sum of two number
		int a=10;
		int b= 20;
		int sum1= a+b;
		System.out.println("Sum of two number is: "+ sum1);
		
		
		//Add two number by the user input
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1= scan.nextInt();
		System.out.println("Enter the second number: ");
		int num2= scan.nextInt();
		
		int sum2= num1+num2;
		System.out.println("Sum of two number is: "+ sum2);
		
		

	}

}
