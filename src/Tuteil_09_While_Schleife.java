// While Schleife

/*
 * Schleifen ermöglichen das wiederholte Ausführen von Codeblöcken, mehrmals hintereinander direkt ausführen 
 * (alles was in den geschweiften Klammern steht), solange bis das gewünschet Ergebnis erreicht wird. Man kann mit 
 * Schleifen Datenstrukturen (Arrays, Listen) befüllen
 * 
 * Scheleifenarten
 * 1. While 
 * 		- ähnelt der if Abfrage
 * 		- wiederholt sich solange eine Bedingung erfüllt wird
 * 		- 
 * 2. Do while
 * 3. For
 * 4. Foreach (besondere Form der for Schleife)
 */
public class Tuteil_09_While_Schleife {

	public static void main(String[] args) {
		int num=1;
		/* 1-5 sollen nacheinander in der Konsole ausgegeben werden
		* man könnte jetzt 5 verschiedenen Variablen deklarieren und mit Print in der Konsole anzeigen
		* while(Bedingung){code}
		* Kopfgesteuerte Schleife (bezieht sich nur auf die erste Ausführung, nur wenn die Bedingung in Schleifenkopf erfüllt ist, wird der Block ausgeführt )
		*/
//	|Schleifenkopf| |Körper|	
	while(num<=10) {	// Schleifenblock, alle Anweisungen, die hier laufen werden wir solange ausführen bis die Bedingung wahr ist. 
	System.out.println(num); // solange num <=5, führe den Code aus
	// num = num+1;
	// num +=1;
	num++; // exact um eins erhöhen
		}
	}
}
