package curs5;

import java.util.Scanner;

public class LetterSearch {

	/*
	 * facem un program care cere un text de la tastatura
	 * cautam in text litera A
	 * daca o gasim printam ca am gasit litera si de cate ori exista in text
	 * daca nu o gasim printam ca nu am gasit litera
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		System.out.println("Please enter a text :");
		Scanner scan =  new Scanner(System.in);
		String text = scan.next();
		
		//char
		//int lungimeText =text.length();
		int counter = 0;
		
		for(int i=0; i<text.length(); i++) {
			// text = ceva => text.charAt(0) --> c ; text.charAt(1) --> 3
			//radar
			//01234
			//radar.charAt(i)
			

			if(text.charAt(i) == 'a' || text.charAt(i) == 'A') {
				counter++;
			}
			
		}
		
		String result = counter >0 ? "Letter A was found " + counter+ " times!":"Letter A was not found ";
		System.out.println(result);
		
		
		
	}

}
