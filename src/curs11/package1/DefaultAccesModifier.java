package curs11.package1;

class DefaultAccesModifier {
	
	/*
	 * Default inseamana atunci cand nu specificam nimic
	 * Scopul este limitat la pachetul in care se afla
	 * 
	 * 
	 * Same class : yes
	 * Sub class same package : yes
	 * Other class same package : yes
	 * 
	 * 
	 * Sub class other package: no
	 * Other class other package : no
	 * 
	 * 
	 */
	
	String mesaj = "Default access modifer";
	
	
	void printMesaj() {
		System.out.println(mesaj);
	}

	public static void main(String[] args) {
		
		DefaultAccesModifier obj = new DefaultAccesModifier();
		obj.printMesaj();
		
		
	}
	
}
