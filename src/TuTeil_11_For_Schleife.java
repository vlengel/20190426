// For Schleife
/*
 * - Wird als Zähler Schleife benannt 
 * - Wird immer dann verwendet, wenn man schon ganz genau weiß, wie oft die Schleife durchlaufen werden soll
 * - Besitzt eine Zählervariable, die Zahl des aktuellen Durchlaufs beinhaltet
 */
public class TuTeil_11_For_Schleife {

	public static void main(String[] args) {
		
		for (int zahl = 0; zahl < 10; zahl++) {
			System.out.println(zahl++);
		}

	}

}
