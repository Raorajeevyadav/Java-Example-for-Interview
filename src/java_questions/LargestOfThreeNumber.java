package java_questions;

public class LargestOfThreeNumber {

	public static void main(String[] args) {
		
		int x,y,z;
		
		x=50;
		y=260;
		z=30;
		
		if(x>y & x>z) {
			System.out.println("x is greater than y and z");
		}
		else if(y>z){
			System.out.println("y is greater than x and z");
		}else {
			System.out.println("z is greater than x and y");
		}

	}

}
