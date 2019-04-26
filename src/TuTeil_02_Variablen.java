
public class TuTeil_02_Variablen {
public static void main(String [] args) {
	
	int a; //Variable Declaration
	a=10; //Initialisation
	int b=30; //Variable Declaration and Initialisation
	int g, f, e; //Declaration of multiple Variables
	int i=12, j=30, k=45; //Declaration of multiple Variables and Initialisation
	
	
	
	System.out.println("Hello world \n"); // ganze Zeile bis Semikoln ist eine Anweisung(Befehl) an den Computer 
	
	int age=38; // Initialisierung (wir erzeugen eine Variable age und geben dieser sofort initial den Wert (38))
	age++;		// den Wert um 1 erhöhen
	
	System.out.println("Initialisierter Wert von age ist " + age);
		
	int age2; // Deklaration (wir erzeugen Variabe und gebt der keinen Wert, aber den Compiler bekanntmachen, hier wird der Defaultwert (0) zugewiesen)
	age2=40;  // Zuweisung des Wertes, man muss hier keinen Datentyp mehr angeben und den Wert in das Behälter reinspeichern.
			  // man spricht hier von einer Zuweisung, da das nicht der erste Wert ist, sondern der zugewiesener
	System.out.println("Erster zugewiesener Wert von age2 ist " + age2);
	
	// Eine Variable kann man auch verwenden, da variabel
	age2 = 50; // neuen Wert zuweisen
	System.out.println("Zweiter zugewiesener Wert von age2 ist " + age2);
	
	age2++;     // den Wert um 1 erhöhen
	System.out.println("Zweiter Wert von age2 + um eins erhöht ist " + age2);

}
}
