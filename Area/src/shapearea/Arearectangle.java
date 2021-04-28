package shapearea;

public class Arearectangle implements Areaofshapes{
	
	private float x;
	private float y;

	public float getLength() {
		return x;
	}

	public float getBreadth() {
		return y;
	}

	public Arearectangle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public float areaCalculation() {
		float area = this.y * this.x;
		return area;
	}

	@Override
	public void setParameters(int x, int y) {
		this.y = y;
		this.x = x;
		
	}

}
