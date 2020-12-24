package java_questions;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		boolean leap=false;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the Year: ");
		int year =scan.nextInt();
		
		
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					leap=true;
				}else {
					leap=false;
				}
				
		}else {
			leap=false;
		}
		
		
	}else {
		leap=false;
	}
if (leap==true) {
	System.out.println("leap year");
}else {
	System.out.println("not a leap year");
}
}}
