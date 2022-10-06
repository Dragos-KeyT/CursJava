package curs9;

public class TestAnimal {
	
	
	public static void main(String[] args) {
		
		Horse horse = new Horse(true, "grass");
		System.out.println("Horse is vegetarian :" + horse.isVegetarian());
		System.out.println("Horse eats :" + horse.getMeal());
		System.out.println("Horse color is :" + horse.getColor());
		
		System.out.println("--------------------------------");
		
		Dog dog = new Dog(false, "hotdog", "White");
		System.out.println("dog is vegetarian :" + dog.isVegetarian());
		System.out.println("dog eats :" + dog.getMeal());
		System.out.println("dog color is :" + dog.getColor());
		
		System.out.println("--------------------------------");

		
		dog.getCeva();
		
		
		
		//Animal doggy = new Dog(false, "carne", "Galben");
		//WebDriver driver = new ChromeDriver();
		
		/*
		 * 
		 * Animal --var MASA
		 * 
		 * Dog -- > MASA cu super --> Animal   
		 * 	   ---> MASA fara super --> Animal
		 * 
		 * MASA exista doar in Animal --> super devine intutil mai sus
		 * 
		 * Dog --> var MASA
		 * 
		 * Acum MASA exista in 2 clase (Parinte = ANimal) si Copil = Dog
		 * acum am nevoie de super ca sa fac diferenta intre copil.MASA si parinte.MASA
		 * 
		 */
		
		
		
	}

}
