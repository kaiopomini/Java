package entities;

public class Rectangle {

	public double width;
	public double height;
	
	public double area() {
		
		return this.width * this.height;
				
	}
	
	public double perimeter() {
		return (this.width * 2) + (this.height*2);
	}
	
	public double diagonal() {
		return Math.sqrt((Math.pow(this.width, 2))+(Math.pow(this.height, 2)));
	}
	public String toString(){
		
		return("AREA = "
				+ String.format("%.2f", area())
				+ String.format("%n", "")
				+ "PERIMETER = "
				+ String.format("%.2f", perimeter())
				+ String.format("%n", "")
				+ "DIAGONAL = "
				+ String.format("%.2f", diagonal())
				);
		
	}
}
