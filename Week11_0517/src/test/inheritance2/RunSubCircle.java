package test.inheritance2;

public class RunSubCircle {

	public static void main(String[] args) {
		int r = 8;
		SubCircle c1 = new SubCircle(r);
		
		c1.calcArea(r);
		c1.calcCircum();
		
		System.out.printf("반지름이 %d인 원의 면적 : %.2f㎠\n", c1.getR(), c1.getArea() );
		System.out.printf("반지름이 %d인 원의 면적 : %.2f㎝\n", c1.getR(), c1.getCircum());

	}

}
