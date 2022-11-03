package studio7;

public class Rectangle {

	private double length;
	private double width;

	public Rectangle(double initLength, double initWidth) {
		length = initLength;
		width = initWidth;
	}

	public double area() {
		return length * width;
	}
	
	public double perimeter() {
		return 2*(length+width);
	}
	
	public boolean square() {
		return length == width;
	}
	
	// How to compare the two areas?
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle i = new Rectangle(3, 4);
		Rectangle j = new Rectangle(5, 6);
		System.out.println(j.square());
		
	}

}
