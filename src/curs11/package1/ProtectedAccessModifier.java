package curs11.package1;

public class ProtectedAccessModifier {
	
	/*
	 * Scopul lui protected este in acealsi pachet si sub-clase din pachete diferite
	 * 
	 * Clasele NU pot declarate ca protected
	 * 
	 * Aceasi clasa :yes
	 * Alta clasa din acealsi pachet : yes
	 * 
	 * Subclasa in acealsi pachet : yes
	 * 
	 * Subclasa in alt pachet : yes
	 * Alta clasa in alt pachet: no
	 * 
	 * 
	 */
	
	protected String mesaj = "Protected Access";

	
	protected void printMesaj() {
		System.out.println(mesaj);
	}
	
	public static void main(String[] args) {
		ProtectedAccessModifier obj = new ProtectedAccessModifier();
		obj.printMesaj();
	}
	
}
