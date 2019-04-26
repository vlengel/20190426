import java.nio.channels.Pipe;

public class Übung { 
  
    public static void main(String args[]) 
    { 
        double a = 12.123; 
        double b = 12.456; 
  
        // prints the minimum of two numbers 
        System.out.println(Math.min(a, b));
        
        //System.out.println(pizza("Ich", "Ich", "bin"));
        
       //pizza ();	 
        
    }
    
    static void pizza(String kaese, String teig, String gemüese) {
    	
    	String [] ingredients = new String [6];
    	
    	ingredients [0] = "Ich";
    	ingredients [1] = "bin";
    	ingredients [2] = "ein";
    	ingredients [3] = "blin";
    	ingredients [4] = "blub";
    	ingredients [5] = "fox";
    	
    	for (int i = 0; i < ingredients.length; i++) {
    		System.out.println(ingredients[i]);
		}
	}
} 