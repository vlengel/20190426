/*
 * 1. Warum benötigt man Datentypen?
 * 1.1 	Warum muss der Computer über diesen Datentyp wissen?
 * 		=> Computer muss immer wissen, mit welchen Werten er gerade zu tun hat, arbeiten soll. 
 * 		=> Wegen verschiedenen Rechenverfahren Ganzzahl, Kommzahl
 * 		=> Damit der Computer weiß, welches Verfahren er gerade anwenden muss
 * 2. Eine Übersicht der primitiven Datentypen
 * 		=> Wieviel BIT Speicherplatz wird dieser Datentyp verwendet
 * 		   boolean (undefiniert) - true oder false
 * 		   char (16 Bit) - Zeichen 
 * 		   byte(8 Bit) - Ganzzahl
 * 		   short (16 Bit) - Ganzzahl
 * 		   int (32 Bit) - Ganzzahl
 * 		   long (64 Bit) - Ganzzahl
 * 		   float (32 Bit) - Fließkommazahl
 * 		   double (64 Bit) - Fließkommazahl
 * 3. Primitive Datentypen in der Praxis
 * 		=> werden immer kleingeschrieben = byte, int, usw..
 */

public class TuTeil_03_Primitive_Datentypen {
	public static void main(String[] args) {
		byte test=127;
		System.out.println("Byte " + test);
		
		short test1=127;
		System.out.println("Short " + test1);
		
		boolean test2 = false;
		System.out.println("Boolean " + test2);
		
		double test3 = 2.123456789;
		System.out.println("Double " + test3);
	}
	
}
