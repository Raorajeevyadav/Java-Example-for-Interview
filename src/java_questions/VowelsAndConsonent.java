package java_questions;

public class VowelsAndConsonent {

	public static void main(String[] args) {
		
		char ch='e';
		
		if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u') {
			System.out.println("character is vowels");
		}
			
			else {System.out.println("character is consonent");
				
			}
			
		//by switch statement
		
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch+" is vowels");
			break;
			default:
				System.out.println(ch + " is consonent");
		}

	}

}
