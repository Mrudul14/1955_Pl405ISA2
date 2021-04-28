package shapearea;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShapeFactory shape = new ShapeFactory();
		Areaofshapes rectangle = shape.getShape("RECTANGLE");
		rectangle.setParameters(5,10);
		System.out.println("Rectangle:"+rectangle.areaCalculation());
		
		Areaofshapes circle = shape.getShape("CIRCLE");
		circle.setParameters(3, 0);
		System.out.println("Circle:"+circle.areaCalculation());
		
		Areaofshapes triangle = shape.getShape("TRIANGLE");
		triangle.setParameters(12, 3);
		System.out.println("Triangle:"+triangle.areaCalculation());

	}

}
