package curs7;

public class ArrayExample {

	public static void main(String[] args) {

		
		String[] textArray = new String[5];
	//  String[] textArray = { null, null, null , null, null}	
		// index :              0      1    2      3     4
		System.out.println(textArray[2]);
		textArray[0] = "This ";
	//  String[] textArray = { "This", null, null , null, null}	
		System.out.println(textArray[0]);
		textArray[1] = " is";
		textArray[2] = " an";
		System.out.println(textArray[2]);
	//  String[] textArray = { "This", " is", " an" , null, null}	
		textArray[3] = " array";
		textArray[4] = "!";
	//  String[] textArray = { "This", " is", " an" , "array", "!"}	
		
		System.out.println("--------------------------");
		
		for(int i = 0; i<textArray.length; i++) {
			
			System.out.print(textArray[i]);
		}
		
		
		System.out.println("----------------------------");
		
		for(String element : textArray) {
			System.out.print(element);
		}
		
		try {
			
			System.out.println(textArray[5]);

		}catch(Exception e) {
			
		}
		
		System.out.println("Some other code!");

	}
	
	
	
	

}
