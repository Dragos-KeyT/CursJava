package curs11.package3;

public class ExceptionExample {
	
	public static void main(String[] args) throws InterruptedException {
		
		String[] week = {"L", "M", "Mi", "J", "V", "S", "D"};
		
		try {
			
		System.out.println(week[9]);
		
		}catch(ArrayIndexOutOfBoundsException e) {

			System.out.println("Exception occured");
			e.printStackTrace();
		}
		
		for(String day : week) {
			Thread.sleep(2000);
			System.out.println(day);
			
		}
		
		
		
	}
	

}
