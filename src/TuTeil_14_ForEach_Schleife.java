/* Was ist ein ForEach Schleife?
 * -> diese Schleife benutzt man um Arrays schrittweise zu durchlaufen  
 *  
 */
public class TuTeil_14_ForEach_Schleife {

	public static void main(String[] args) {
		// Array definieren
		//String[] names = new String[3]; // leeres Objekt erzeugen 
		
		System.out.println("************ For Schleife *************");
		String[] bons = {"Aramis", "Barbaris", "Arahis","Mishka na severe","Krasotka"};
		
		// for Schleife
		for (int i = 0; i < bons.length; i++) { // maximale Länge des Arrays übergeben
			System.out.println(bons[i]);
			}
		System.out.println("\n********** Foreach Schleife ***********");
		
		//foreach Schleife 
		for (String konfety : bons) { // durchlaufe Array bons und speichere in jedem Durchlauf eine Kopie
									  // in die Variable konfety vom Typ String 
			System.out.println(konfety);
		}
	} 
}
