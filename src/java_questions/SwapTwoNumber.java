package java_questions;

public class SwapTwoNumber {

	public static void main(String[] args) {
		
		
		int a=20;
		int b=30;
		
		System.out.println("First numner after swaping is: "+(a+b-a));
		System.out.println("First numner after swaping is: "+(a+b-b));
		
		
		//with 3rd variable
		int c;
		c=a+b;
		a=c-a;
		b=c-b;
		System.out.println("First numner after swaping is: "+a);
		System.out.println("First numner after swaping is: "+b);
		
		
	}

}
