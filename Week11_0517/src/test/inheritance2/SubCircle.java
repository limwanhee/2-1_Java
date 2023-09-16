package test.inheritance2;

public class SubCircle extends SuperCircle {
	private double circum;
	private int r;
	
	public SubCircle(int r) {
		this.r = r;
	}

	public int getR() {
		return r;
	}

	public double getCircum() {
		return circum;
	}
	
	public void calcCircum() {
		circum = 2 * Math.PI * r;
	}
}
