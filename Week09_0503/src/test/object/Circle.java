package test.object;

public class Circle {
	private int r;
	private double circum;
	private double area;
	
	
	
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

	public void calcCircum() { //원의 둘레 계산
		circum = 2 * Math.PI * r;
	}
	
	public void calcArea() { //원의 면적 계산
		area = Math.PI * Math.pow(r, 2);
		
	}
	
}
