package shapearea;

public class ShapeFactory {
	
   public Areaofshapes getShape(String Type){
      if(Type == null){
         return null;
      }		
      if(Type.equalsIgnoreCase("RECTANGLE")){
         return new Arearectangle();
         
      } else if(Type.equalsIgnoreCase("CIRCLE")){
         return new Areacircle();
         
      } else if(Type.equalsIgnoreCase("TRIANGLE")){
	         return new Areatriangle();
	  }
	      
	  return null;
	  }
}