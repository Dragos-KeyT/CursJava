package curs2;
//intodeauna cu litera mica
//com.microsoft.numeproiect.numefuctionalitate


// one line comment

/*
 * multi line comment
 * 
 */

public class Tester {

	//variabile
	private String nume;
	private int ratePerHour;
	
	//constructor default
	public Tester() {}
	
	
	//getter & setter
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getRatePerHour() {
		return ratePerHour;
	}
	public void setRatePerHour(int ratePerHour) {
		this.ratePerHour = ratePerHour;
	}
	
	public void printeazaNume() {
		System.out.println(nume);
	}
	
	public void printeazaNimic() {
		printeazaNume();
	}
	
}
