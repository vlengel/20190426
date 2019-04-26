/* Mehrdimensionale Arrays
 * - Datenstruktur (Datensamlung)
 * - Wie normale (eindimensionale) Arrays, nut mit mehreren Dimensionen
 */
public class Tuteil_15_MehrdimensionaleArrays {
	public static void main(String[] args) {
	/*man möchte zweidimensionales Array programmieren und im Array logisch zueinander gehörende Vor und Nachnamen 
	 * speichern. Tabelle mit 5 Zeilen und zwei Spalten (Vor-/ Nachnamen)
	 * 
	 */
	
		String[][] FirtsAndLastName = new String [5][2];
		
		FirtsAndLastName[0][0] = "Franz"; // erste Zeile
		FirtsAndLastName[0][1] = "Bauer";
		
		FirtsAndLastName[1][0] = "Felix"; // zweite Zeile
		FirtsAndLastName[1][1] = "Huber";
		
		FirtsAndLastName[2][0] = "Fritz"; // dritte Zeile
		FirtsAndLastName[2][1] = "Meier";
		
		// Äußere For-Schleife: Zeilenindex => i
		// Innere For-Schleife: Spaltenindex => j
		
		for (int i = 0; i < FirtsAndLastName.length; i++) {
			for (int j = 0; j < FirtsAndLastName[i].length; j++) {
				System.out.print(FirtsAndLastName[i][j] +" ");
			}
			System.out.println();
		}
	}
}
