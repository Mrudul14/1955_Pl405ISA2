package shapearea;


public class Areacircle implements Areaofshapes {
	
	private float r;

	public float getRadius() {
		return r;
	}

	public Areacircle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public float areaCalculation() {
		float area = (float) (2 * 3.14 * this.r);
		return area;
	}

	@Override
	public void setParameters(int x, int y) {
		this.r = x;
	}

}
