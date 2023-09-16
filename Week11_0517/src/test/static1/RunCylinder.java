package test.static1;

public class RunCylinder {
	public static void printCylinder(Cylinder cylinder) {
		System.out.printf("top radius : %d㎝\n", cylinder.getR());
		System.out.printf("top height : %d㎝\n", cylinder.getH());
		System.out.printf("top volume : %.2f㎤\n", cylinder.getVolume());
	}

	public static void main(String[] args) {
		Cylinder c1 = new Cylinder(7, 15);
		Cylinder c2 = new Cylinder(15, 25);
		
		c1.calcvolume();
		c1.print();
		
		c2.calcvolume();
		c2.print();

	}

}
