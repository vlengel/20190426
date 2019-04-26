/* Array 
 * - ist eine Datenstruktur (Datensamlung)
 * - wie Variablen die mehrere Werte beinhlaten können
 * - Der Zugriff auf verschieden Werte erfolgt über einen Index
 * - definieren heißt -> deklarieren + initialisieren
 */
public class TuTeil_13_Array {

	public static void main(String[] args) {
		
		String[] names = new String [5]; 
		names[0] = "Vlad";
		names[1] = "Sevil";
		names[2] = "Raffael";
		
		// new -> wenn man einen Array erstellen möchte, schreibt man new+typ
		// [3] wieviele Werte möchte man im Array speichern
		// die Größe eines Array wird immer bei der Initialisierung festgelegt
		//System.out.println(names);

		for (int i = 0; i < names.length; i++) { // mit 'lenght' spricht man Attribut von String an und gibt uns max. Länge von Array [3]
			System.out.println(names [i]);

		}
	}
	

}
