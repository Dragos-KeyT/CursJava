package curs5;

import java.util.Scanner;

public class ForVsWhile {

	
	/*
	 * facem un program care ii cere userului numere incontinuu
	 * le inmulteste cu 10
	 * pana cand userul introduce 0
	 * daca a introdus 0 -- facem exit din loop
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		//rezolvareCuFor2();
		//rezolvareCuFor();
		//rezolvareCuWhile();
		
		
		rezolvareCuDoWhile();
	}
	
	/**
	 * rezolvare cu for pentru problema
	 */
	public static void rezolvareCuFor() {
		
		System.out.println("Please enter a number :");
		Scanner scan =  new Scanner(System.in);
		
		for(;;) {
			int nr = scan.nextInt();
			if(nr ==0) {
				break;
			}
			System.out.println("Please enter a number :");
			System.out.println(nr*10);	
		}
		System.out.println("Exit!");
		
	}
	
	/**
	 * 
	 * @param text
	 */
	
	public static void rezolvareCuFor2() {
		System.out.println("Please enter a number :");
		Scanner scan =  new Scanner(System.in);
		
		for(int nr = scan.nextInt(); nr!=0; nr=scan.nextInt()) {
			nr*=10;
			System.out.println(nr);
			System.out.println("Please enter a number :");
		}
		System.out.println("Exit!");

	}
	
	public static void rezolvareCuWhile() {
		
		System.out.println("Please enter a number :");
		Scanner scan =  new Scanner(System.in);
		
		int nr = scan.nextInt();
		while(nr!=0) {
			nr*=10;
			System.out.println(nr);
			System.out.println("Please enter a number :");
			nr=scan.nextInt();
		}
		System.out.println("Exit!");
		
	}
	
	public static void rezolvareCuDoWhile() {
		
		Scanner scan =  new Scanner(System.in);
		int nr;
		do {
			System.out.println("Please enter a number :");

			nr =  scan.nextInt();
			System.out.println(nr*10);
			
		}while(nr!=0);
		
	}
	
	
	
	public void forVsWhile() {
		
		for(int i =0; i<10; i++) {
			
			System.out.println(i);
		}
		
		
		
		int j =0;
		while(j<10) {

			System.out.println(j);
			j++;
		}
		
		
		boolean flag = true;
		
		for(;flag==true; ) {
			
			//code care updateaza flag
			
		}
		
		while(flag) {
		
			//code care updateaza flag

			
		}
		
		

	}

	
	
}
