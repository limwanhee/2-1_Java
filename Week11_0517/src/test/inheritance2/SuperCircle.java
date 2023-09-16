package test.inheritance2;

public class SuperCircle {
	private double area;

	public void calcArea(int r) {
		area = Math.PI * Math.pow(r, 2);
	}
	
	public double getArea() {
		return area;
	}
	
}
