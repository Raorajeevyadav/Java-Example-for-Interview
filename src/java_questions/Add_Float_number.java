package java_questions;

import java.util.Scanner;

public class Add_Float_number {

	public static void main(String[] args) {
		
		//normal sum of two float number
				float a=2.5f;
				float b= 1.2f;
				float sum1= a*b;
				System.out.println("Multiplication of two number is: "+ sum1);
				
				
				//Multiply two number by the user input
				Scanner scan= new Scanner(System.in);
				System.out.println("Enter the first number: ");
				float num1= scan.nextFloat();
				System.out.println("Enter the second number: ");
				float num2= scan.nextFloat();
				
				float sum2= num1*num2;
				System.out.println("Multiplication of two number is: "+ sum2);
				
				

		

	}

}
