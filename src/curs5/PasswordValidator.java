package curs5;

import java.util.Scanner;

public class PasswordValidator {

	/*
	 * Facem un program care valideaza o parola pe baza unor reguli:
	 * Reguli:
	 * 1.Parola trebuie sa contina 10 caractere
	 * 2.Parola trebuie sa contina o litera upper case
	 * 3.Parola nu trebuie sa fie la fel ca username
	 * 
	 * intrebam utilizatorul username si parola 
	 * informam utilizatorul care sunt reguluile parolei
	 * 
	 * validam parola
	 * daca parola respecta regulile, printam : "Parola propusa este valida"
	 * 
	 * Spargem programul in cat mai multe metode
	 * folosim un do-while pentru logica de validare
	 * 
	 */
	
	/*
	 * metoda -> reguli de informare
	 * metoda -> username si parola 
	 * metoda -> validare parola
	 * 
	 */
	String username;
	//String password;
	Scanner scan  =  new Scanner(System.in);
	boolean valid;

	public void printPassowrdRules() {
		System.out.println("Reguli parola:");
		System.out.println("1.Parola trebuie sa contina 10 caractere");
		System.out.println("2.Parola trebuie sa contina o litera upper case");
		System.out.println("3.Parola nu trebuie sa fie la fel ca username");
	}
	
	
	public void getUsername() {
		System.out.println("Te rog sa introduci username:");
		username = scan.next();
		//password =  scan.next();
	}
	
	
	public String getProposedPassword() {
	
		System.out.println("Te rog sa introduci o parola: ");
		return scan.next();
	}
	
	
	
	
	
	public boolean isValid() {
		return valid;
	}
	
	public void checkPasswordRules(String password) {
		valid =true;
		
		if(password.length() <10) {
			valid = false;
			System.out.println("Parola trebuie sa contina cel putin 10 caractere");
		}
		if(password.equals(password.toLowerCase())) {
			valid = false;
			System.out.println("Parola trebuie sa contina cel putin o litera upper case");
		}
		if(username.equalsIgnoreCase(password)) {
		//username.toLowerCase().equals(password.toLowerCase())
			valid = false;
			System.out.println("Parola nu trebuie sa fie la fel ca username");

		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		PasswordValidator obj = new PasswordValidator();
		obj.printPassowrdRules();
		obj.getUsername();
		
		do {
			obj.checkPasswordRules(obj.getProposedPassword());

		}while(!obj.isValid());
		
		System.out.println("Parola este valida!");
		
	}

}
