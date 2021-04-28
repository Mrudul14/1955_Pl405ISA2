package shapearea;

public class Areatriangle implements Areaofshapes{
	
	private float base;
	private float ht;

	public float getBase() {
		return base;
	}

	public float getHeight() {
		return ht;
	}

	public Areatriangle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public float areaCalculation() {
		float area = (float) (0.5 * this.base * this.ht);
		return area;
	}

	@Override
	public void setParameters(int x, int y) {
		this.base = x;
		this.ht = y;
	}

}
