import java.awt.image.RescaleOp;

/* -> Methode ist ein Stück vorprogrammierter Code, den wir immer wieder ausführen können, ohne disen neu schreiben zu müssen 
 * -> Main ist auch eine Methode
 */
public class TuTeil_16_Methoden {
	public static void main(String[] args) {
		calculate(10,20);
	}
	
	public static void calculate (int num1, int num2) {
		int x = num1;
		int y = num2;
		int z = x+y;
		System.out.println(z);
	}
}
