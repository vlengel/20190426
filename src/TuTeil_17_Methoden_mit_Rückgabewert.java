/* Methoden mit Rückgabewert
 * -> Rückgabewert ein Wert, den eine Methode an ihren Aufrufer zurückgibt
 * ->> kann als Ergebnis der Methode angesehen werden 
 */
public class TuTeil_17_Methoden_mit_Rückgabewert {

public static void main(String[] args) {
		System.out.println("Vor dem Methodenaufruf\n");
		
		System.out.println("Nach dem Methodenaufruf");
		doSomething(30, 20);
	}
	public static int doSomething(int num1, int num2) { // void gibt nichts zurück
		System.out.println(num1+num2);
		
		return num1+num2;
	}
}