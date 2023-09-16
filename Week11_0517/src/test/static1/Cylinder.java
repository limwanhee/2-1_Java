package test.static1;

//원기둥의 부피
public class Cylinder {
//원기둥의 부피 = 윗면 원의 면적 * 높이
	public static final double PI = 3.14159265;
	private int r;
	private int h;
	private double volume;
	
	public Cylinder(int r, int h) {
		this.r = r;
		this.h = h;
	}

	public static double getPi() {
		return PI;
	}

	public int getR() {
		return r;
	}

	public int getH() {
		return h;
	}

	public double getVolume() {
		return volume;
	}
	
	public void calcvolume() {
		volume = PI * Math.pow(r, 2) * h;
	}
	
	public void print() {
		RunCylinder.printCylinder(this);
	}
	
	
}
