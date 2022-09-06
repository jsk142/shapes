
public class Square extends Shape{
	
	private double sideLength;
	
	public Square( ShapeDescription description ) {
		super( description );
		sideLength = description.getDoubles().elementAt(0);
	
	}

	public double getArea() {
		double area = sideLength*sideLength;
		return area;
	}
	
	public double getPerimeter() {
		double perimeter =  4*sideLength;
		return perimeter;
	}
}
