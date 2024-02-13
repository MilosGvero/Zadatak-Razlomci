package fraction;

public class FractionsTesting {

	
		
	
	public static void main(String[] args) {
		
	
		Fraction fraction1 = new Fraction(10, 20);
        Fraction fraction2 = new Fraction(3, 20);
       
       
        System.out.println("Ulazni parametar 1: " + fraction1);
        System.out.println("Ulazni parametar 2: "  + fraction2);

        Fraction add = fraction1.add(fraction2);
        System.out.println("Sabrano: " + add); 

        Fraction multiply = fraction1.multiply(fraction2);
        System.out.println("Pomnozeno: " + multiply); 
        
      
       System.out.println("Pre skracivanja : " + multiply);
       multiply.simplifyFraction();
       System.out.println("Posle skracivanja : " + multiply);
    }
		
    
		
}

		


