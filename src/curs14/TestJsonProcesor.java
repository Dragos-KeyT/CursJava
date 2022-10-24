package curs14;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

public class TestJsonProcesor {
	
	public static void main(String[] args) throws ParseException, FileNotFoundException, IOException {
		
		JsonFileProcessor jsonFile =  new JsonFileProcessor();
		
		//jsonFile.writeJsonFile();
		
		jsonFile.readJsonFile("name");
		jsonFile.readJsonFile("email");
		//jsonFile.readJsonFile("listaObiecte");
		jsonFile.updateJsonFile("email2", "test@ceva");
		jsonFile.updateJsonFile("email", "altTest");
		jsonFile.deleteFromJsonFile("name");
		System.out.println("--------------");
		jsonFile.readJsonFile("name");

			
	}
	

}
