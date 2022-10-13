package curs11.package3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample2 {
	
	public static void main(String[] args) {
		
		

		
		try {
			System.out.println("Please enter number 1: ");
			Scanner scan =  new Scanner(System.in);
			int num1 =  scan.nextInt();
			System.out.println("Please enter number 2:");
			int num2 =  scan.nextInt();
			num2 = (Integer) null;
			int division =  num1/num2;
			System.out.println("division :" + division);
			
		}catch(ArithmeticException e) {
		
			System.out.println("Please do not divide by zero!");
			
		}catch (InputMismatchException e) {

			System.out.println("Please enter only numeric!");
			
		}catch (NullPointerException e) {

			System.out.println("Null pointer was thrown");
			
		}catch (Exception e) {

			System.out.println("Something went wrong");
		}
		
		
		System.out.println("Code after try-catch");
		
		
		System.out.println("--------------");
		
		try {
			System.out.println("Please enter number 1: ");
			Scanner scan =  new Scanner(System.in);
			int num1 =  scan.nextInt();
			System.out.println("Please enter number 2:");
			int num2 =  scan.nextInt();
			num2 = (Integer) null;
			int division =  num1/num2;
			System.out.println("division :" + division);
			
		}catch (Exception e) {

			System.out.println("Something went wrong");
		}
		
		
	}

}
