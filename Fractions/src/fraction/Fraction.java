package fraction;

public class Fraction {
	
	private int brojilac;
	private int imenilac;
	
	
	 
    public Fraction(int brojilac) {
        this.brojilac = brojilac;
        this.imenilac = 1; 
    }

   
    public Fraction(int brojilac, int imenilac) {
    	
    	if (imenilac == 0) {
            throw new IllegalArgumentException("Imenilac ne moze biti nula.");
        }
    	
        this.brojilac = brojilac;
        this.imenilac = imenilac;
    }
	
    public int getBrojilac() {
		return brojilac;
	}
	public void setBrojilac(int brojilac) {
		this.brojilac = brojilac;
	}
	public int getImenilac() {
		return imenilac;
	}
	public void setImenilac(int imenilac) {
		this.imenilac = imenilac;
	}
    
	
	@Override
    public String toString() {
        return brojilac + "/" + imenilac;
	}

	
	
	public Fraction add(Fraction other) {
        int rezultatBrojilac, rezultatImenilac;
 
       
        if (this.imenilac == other.getImenilac()) {
        	rezultatBrojilac = this.brojilac + other.getBrojilac();
            rezultatImenilac = this.imenilac;
        } else {
          
        	rezultatBrojilac = this.brojilac * other.getImenilac() + other.getBrojilac() * this.imenilac;
        	rezultatImenilac = this.imenilac * other.getImenilac();
        }

        return new Fraction(rezultatBrojilac, rezultatImenilac);
    }
	
	public Fraction multiply(Fraction other) {
        int resultBrojilac = this.brojilac * other.getBrojilac();
        int resultImenilac = this.imenilac * other.getImenilac();

        return new Fraction(resultBrojilac, resultImenilac);
    }
	
	
	 private int gcd(int a, int b) {
	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        return a;
	    }
	 
	 private void simplify() {
	        int commonDivisor = gcd(Math.abs(brojilac), Math.abs(imenilac));
	        brojilac /= commonDivisor;
	        imenilac /= commonDivisor;
	    }
	
	 public void simplifyFraction() {
	        simplify(); 
	    }
	
}
