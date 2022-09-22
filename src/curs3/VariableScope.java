package curs3;

public class VariableScope {

	/*
	 * 1. compiling
	 * ...
	 * 2. cauta membrii statici (var sau metoda care are definint in declartie cuvantul static)
	 * ...
	 * 3. Instantiaza obiectele
	 * 
	 * 
	 */
	
	
   //instance variables
	public String prenume;
	
//local variables
	
//static varibles		
	
	public  void main(String[] args) {
		prenume = "da";
		
	}
	
	
	public void printeazaSalut(String nume) {	
		int age = 2;
		System.out.println("Salut " + nume + prenume);	
	}
	

}
