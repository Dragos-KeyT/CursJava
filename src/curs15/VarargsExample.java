package curs15;

public class VarargsExample {

	public static void main(String[] args) {

		printCeva(1, "unu", "doi", "trei", "patru");
		printCeva(2);

		//executeScript("js script", buton, buton2);
		printCevaGeneric(12, "123", 'c');
	}

/*	public static void printCeva(String a, String b) {
		System.out.println(a);
		System.out.println(b);
	}*/
	
	public static void printCeva(int nr, String...values ) {
	
		for(String x: values) {
			
			System.out.println(x);
		}
	}
	
	public static <T>void printCevaGeneric(T...values ) {
		
		for(T x: values) {
			
			System.out.println(x);
		}
	}
	
	// git add .
	// git commit -m "curs15"
	// git switch master
	// git merge curs15
	// git branch -d curs15
	// git push origin master
	
	
	
	
}
