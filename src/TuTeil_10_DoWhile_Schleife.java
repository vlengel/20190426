/* Do-While Schleife 
 * - Die Bedingung wird nicht am Anfang sondern am Ende geprüft wird und zwar nach dem Schleifenblock
 * - Resultat: Schleife wird IMMER min. 1x geprüft
 * 	 => auch, wenn Bedingung bereits von Beginn an nicht erfüllt ist. 
 * - Fußgesteuert (beginnt zuerst bei while Bedingung)
 */
public class TuTeil_10_DoWhile_Schleife {
		public static void main(String[] args) {
			int num = 2;
	do { //zuerst wird do ausgeführt und dann wird while Bedingung gecheckt
		System.out.println(num++); // solange num <=5, führe den Code aus
		// num = num+1;
		// num +=1;
		//num++; // exact um eins erhöhen
	}
	while (num<=5); // zuerst wird diese Bedingung geprüft
	}
}