
public class Rectangle extends Shape{
		
	private double width, height;
		
	public Rectangle( ShapeDescription description ) {
		super( description );
		width = description.getDoubles().elementAt(0);
		height = description.getDoubles().elementAt(1);
			
	}
	
	public double getArea() {
		double area = width*height;
		return area;
	}
	
	public double getPerimeter() {
		double perimeter = 2*(width+height);
		return perimeter;
	}
}
