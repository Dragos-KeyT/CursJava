package curs9;

import java.util.List;

public class OverloadExample {
	
	
	public static void main(String[] args) {
		
		System.out.println(multiply(2, 3));


		System.out.println("1");
		
			
		
	}

	
	public static int multiply(int a , int b) {
		return a*b;
	}
	
	public static double multiply(double a , double b) {
		return a*b;
	}


}
