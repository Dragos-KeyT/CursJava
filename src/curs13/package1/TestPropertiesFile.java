package curs13.package1;

public class TestPropertiesFile {
	
	
	public static void main(String[] args) {
		
		PropertiesFileProcesor obj =  new PropertiesFileProcesor();
		//obj.writePropertiesFile();
		obj.readPropertiesFile("user");
		obj.readPropertiesFile("browser");
		obj.readPropertiesFile("email");
		
		//String url = obj.readPropertiesFile("dev_url");
		//driver.get(url)
		System.out.println("-------------------------");
		obj.updatePropertiesFile("browser", "firefox");
		obj.readPropertiesFile("browser");

		System.out.println("-------------------------");
		obj.deleteFromPropertiesFile("email");
		
		
	}

}
