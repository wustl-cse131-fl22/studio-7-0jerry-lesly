package studio7;

public class Fraction {
	private double numerator;
	private double denominator;

	public Fraction(double initN, double initD) {
		numerator = initD;
		denominator = initN;
	}
	public double reciprocal () {
		double intermediate= numerator ;
		numerator =  denominator;
		denominator = intermediate;
		//How to return?
		
	}

}
