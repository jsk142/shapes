
public class Triangle extends Shape{
	
	private double sideA, sideB, sideC;
	
	public Triangle( ShapeDescription description ) {
		super( description );
		sideA = description.getDoubles().elementAt(0);
		sideB = description.getDoubles().elementAt(1);
		sideC = description.getDoubles().elementAt(2);
		
	}
	
	public double getArea() {
		double semi = (sideA + sideB + sideC)/2;
		double area = Math.sqrt(semi*(semi-sideA)*(semi-sideB)*(semi-sideC));
		return area;
	}

	public double getPerimeter() {
		double perimeter = sideA + sideB + sideC;
		return perimeter;
	}
}
