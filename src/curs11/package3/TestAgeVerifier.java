package curs11.package3;

import java.util.Scanner;

public class TestAgeVerifier {
	
	public static void main(String[] args) {
		
		AgeVerifier obj =  new AgeVerifier();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please eneter your age: ");
		int age =  scan.nextInt();
		
		//obj.checkAgeLimit(age);
		
		try {
			obj.checkAgeLimit(age);
			
		} catch (InvalidAgeException e) {
			e.printStackTrace();
			System.out.println("Invalid age to vote!");
		}
		
	}

}
