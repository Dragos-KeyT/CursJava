package curs6;

import java.util.Scanner;


public class SwitchExample2 {
	
	/*
	 * Facem un program care verifica daca un student este eligibil
	 * pentru o bursa de studii
	 * Conditiile sunt:
	 * Sa fie anul 3
	 * Sa aiba un punctaj de 80 pentu bursa 1
	 * Sa aiba un punctaj de 50 pentu bursa 2
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("Te rog introdu in ce an esti :");
		Scanner scan  = new Scanner(System.in);
		int an =  scan.nextInt();
		int punctaj;
		
		switch(an) {
		
		case 1:
		case 2:
			System.out.println("Nu esti eligibil pentru bursa!");
			break;
		case 3:
			System.out.println("Te rog introdu punctajul:");
			punctaj =  scan.nextInt();
			switch(punctaj) {
			case 50:
				System.out.println("Esti eligibil pentru bursa 1");
				break;
			case 80:
				System.out.println("Esti eligibil pentru bursa 2");
				break;
			default:
				System.out.println("Te rog introdu o valoare valida!");

			}
		break;
		default:
			System.out.println("Te rog sa introduci un an valid!");}
		
		
		
		
		
	}

}
