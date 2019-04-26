/*Switch case Abfrage
* Switch case Blöcke (wie if )
* wird nicht anhand der Bedingung ausgeführt, sondern anhand der Konstante 
* 		|| Konstante ||
* ||case|| "Kuznecov"||: ||System.out.println("Kuznecov");|| break||;
*/

public class TuTeil_08_Switch_Case_Abfrage {

	public static void main(String[] args) {
		String name = "Grebnyov";
		String vorname = "Vlad"; 
		
		switch (name) {
		case "Kuznecov": System.out.println("Kuznecov"); break;
		case "Schumacher": System.out.println("Schumacher");break;
		case "Grebnyov": System.out.println("Grebnyov");break;
		default: System.out.println("Kein Name vorhanden!");break;
		}
		
		switch (vorname) {
		case "Vlad": System.out.println("Vlad"); break;
		case "Viktor": System.out.println("Viktor"); break;
		case "Michael": System.out.println("Michael"); break;
		default: System.out.println("Kein Vorname vorhanden");break;
		}		
	}
}