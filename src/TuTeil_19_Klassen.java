import vlad.Car;

/*
 * - Eine Klasse ist ein Bauplan für ein Projekt
 * - In einer Klasse werde zwei Dinge definiert 
 *   > Welche Eigenschften/Attribute hat ein Objekt? 
 *     >> Daten, die das Objekt beschreiben Farbe, Marke, Name
 *   > Welche Methoden kann ein Objekt ausführen? 
 *     >> Die Methoden geben dem Objekt die Funktionalität
 *     >> Das Objekt kann etwas tun mit Hilfe der Methode
 *   > Von einer Klasse können Objekte erzeugt werden
 *     >> Jedes Objekt hat seine eigene Attribute und kann seine Methoden selbstständig ausführen
 *     >> Man erzeugt ein/mehrere Objekt/e aus einer Klasse mit Methoden 
 */
public class TuTeil_19_Klassen {

	public static void main(String[] args) {
		// Wir wollen ein Objekt der Klasse "Car" erzeugen => instanziiren 
		
		Car car1 = new Car(); // Erstellung/Instanziierung eines Objekts
		car1.drive();
		//car1.color = "Gelb";
		//System.out.println(car1.color);
		
		
		  car1.setColor("Gelb"); 
		  System.out.println("Auto Nr.1 is " + car1.getColor());
		  
		  Car car2 = new Car(); car2.setColor("Red"); 
		  System.out.println("Auto Nr.2 is " + car2.getColor());
		 
	}
}
