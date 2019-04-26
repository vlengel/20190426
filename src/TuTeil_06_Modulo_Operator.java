/*
 * Modulo Operator 
 * 	=> wird durch ein Prozentzeichen % dargestellt
 * 	=> Restwert Operator
 * 	=> Rest der nach Division übrig bleibt
 * 	=> der Rest wird ausgegeben, der Division übricg bleibt
 * 	=> funktioniert nur bei Ganzzahlen
 * 	=> 32 % 3
 * 	=> Wie oft passt eine Zahl in den Wert ein
 * 		10*3=30
 * 		32-30=2
 * 
 */
public class TuTeil_06_Modulo_Operator {

	public static void main(String[] args) {
		System.out.println("************* Division mit Operator / **************");
		int numberDiv = 32/3;
		System.out.println(numberDiv);		
		
		System.out.println("\n ************* Modulo mit Operator % **************");
		int numberMod = 32%3;
		System.out.println(numberMod);
	}

}
