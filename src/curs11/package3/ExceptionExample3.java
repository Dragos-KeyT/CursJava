package curs11.package3;

public class ExceptionExample3 {
	
	public static void main(String[] args) {
		
		try {
			String name = null;
			System.out.println(name.length());
			
		}catch(Exception e) {
			
			System.out.println("Exception occured");
			System.out.println(3/0);
			
			
		}finally {
			
			System.out.println("Finally block of code");
			
		}
		
		
		System.out.println("Code after try - catch");
		
	}

}
