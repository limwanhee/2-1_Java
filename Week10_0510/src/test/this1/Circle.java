package test.this1;

public class Circle {
	private int r;
	private double circum;
	private double area;
	
	public Circle(int r) {
		this.r = r;
	}
	
	public Circle(int r, double circum) {
		this(r);
		this.circum = circum;
	}
	
	public Circle(int r, double circum, double area) {
		this(r, circum);
		this.area = area;
	}

	public int getR() {
		return r;
	}
	
	public void setR(int r) {
		this.r = r;
	}
	
	public double getCircum() {
		return circum;
	}
	
	public double getArea() {
		return area;
	}
	
	public void calcCircle() {
		circum = 2 * Math.PI * r;
		area = Math.PI * Math.pow(r, 2);
		RunCircle.printCircle(this);
	}
}
