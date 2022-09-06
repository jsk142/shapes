
public class FunWithShapes extends ShapeHandler{
	
	public FunWithShapes() throws ShapeException{
		super();
	}
	
	public void convertDescriptionsToShapes() {
		for (int i = 0; i < shapeDescriptions.size(); i++) {
			if ( shapeDescriptions.elementAt(i).getShapeType() == ShapeDescription.ShapeTypes.CIRCLE) {
				Circle addMe = new Circle( shapeDescriptions.elementAt(i));
				shapes.add(addMe);
			}
			else if ( shapeDescriptions.elementAt(i).getShapeType() == ShapeDescription.ShapeTypes.SQUARE) {
				Square addMe = new Square( shapeDescriptions.elementAt(i));
				shapes.add(addMe);
			}
			else if ( shapeDescriptions.elementAt(i).getShapeType() == ShapeDescription.ShapeTypes.RECTANGLE) {
				Rectangle addMe = new Rectangle( shapeDescriptions.elementAt(i));
				shapes.add(addMe);
			}
			else {
				Triangle addMe = new Triangle( shapeDescriptions.elementAt(i));
				shapes.add(addMe);
			}
		}
	}
	
	public double sumOverAreas() {
		double totalArea = 0.0;
		
		for (int i = 0; i < shapes.size(); i++) {
			totalArea += shapes.elementAt(i).getArea();
		}
		
		return totalArea;
	}
	
	public double sumOverPerimeters() {
		double totalPerimeter = 0.0;
		
		for (int i = 0; i < shapes.size(); i++) {
			totalPerimeter += shapes.elementAt(i).getPerimeter();
		}
		
		return totalPerimeter;	
	}
	
	public static void main (String[] args) throws ShapeException{
		FunWithShapes fun = new FunWithShapes();
		
		double shapeArea = 0.0;
		double shapePerimeter = 0.0;
		
		shapeArea = fun.sumOverAreas();
		shapePerimeter = fun.sumOverPerimeters();
		
		System.out.println(shapeArea);
		System.out.println(shapePerimeter);
		
		return;
	}

}
