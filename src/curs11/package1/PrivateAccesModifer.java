package curs11.package1;

public class PrivateAccesModifer {
	
	/*
	 * Scopul lui este limitat la clasa in care se afla
	 * 
	 * Same class: yes
	 * 
	 * Subclass same package : no
	 * Other class same packge : no
	 * Subclasa other package: no
	 * Other class other package:no
	 * 
	 */
	
	private PrivateAccesModifer() {}
	
	
	private String mesaj = "Private Access";

}
