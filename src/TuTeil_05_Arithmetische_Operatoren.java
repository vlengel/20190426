/*
 * Arithmetische Operatoren
 * 1. Übersicht über Operatoren
 * 	  => = ist ein Zuweisungsoperator 
 * 	  => + ist ein arithmetischer Operator 
 * 2. Arithmetische Operatoren in der Praxis
 */

public class TuTeil_05_Arithmetische_Operatoren {

	public static void main(String[] args) {
		int numb1 = 3/4; // 3+4 ist ein Ausdruck ist immer eine Rechnung, die immer ein Ergebnis zurückliefert. 
						   // hier liest man von rechts nach links 
						   // 3+4 ergibt 7
						   // die 7 wird der Variable zugewiesen
						   // hier haben wir das mit einer Varaible realisiert
						   // man kann auch mit mehreren Variable realisieren
		
		System.out.println(numb1);
		System.out.println("*************Variant 1**************");
		 
		// man kann auch mit mehreren Variable realisieren
		int numb2 = 12;
		int numb3 = 2;
		int result = numb2 + numb3; 
		System.out.println("Result of numb2 & numb3 = " + result);		
		System.out.println("\n*************Variant 2**************");
		
		int numb4 = 2;
		int numb5 = 3;
		System.out.println(numb4 + numb5);
		
		System.out.println("\n*************Variant 3**************");
		int numb6 = 2;
		int numb7 = 3;
		System.out.println("Verkettung von " + numb6 + "&" + numb7 +" = " + numb6 + numb7);
		
	}

}
