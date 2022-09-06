
public class Circle extends Shape{
	
	private double radius;

	public Circle( ShapeDescription description ) {
		super( description );
		radius = description.getDoubles().elementAt(0);
		
	}
	
	public double getArea() {
		double area = Math.PI*radius*radius;
		return area;
	}
	
	public double getPerimeter() {
		double perimeter =  2*Math.PI*radius;
		return perimeter;
	}
}
