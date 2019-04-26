
public class TuTeil_07_If_Abfragen {
/*
 * Eine If-Anweisung ist ein Codeblock, welcher nur dann ausgeführt wird, wenn eine bestimmte Bedingung erfüllt wird.
 * if - Anweisung
 * age > 18 - Bedingung
 */
	public static void main(String[] args) {
		int age=17;
		float high=1.90f;
		
		if (age <=18) {
			System.out.println("Du bist noch zu jung, da du unter 18 bist !"); 
			if (high <= 1.80) {
				System.out.println("Deine Größe ist " + high);
			}
			else {
				System.out.println("Deine Größe passt leider auch nicht! Du musst weniger als "+high+"cm sein");
			}
		}
		else {
			System.out.println("Du bist Erwachsen, da du schon 18 bist !");
	}
  }
}