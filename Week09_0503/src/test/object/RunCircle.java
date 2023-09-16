package test.object;

public class RunCircle {

	public static void main(String[] args) {
		Circle c1 = new Circle(); //반지름이 10인 원
		Circle c2 = new Circle(); //반지름이 6인 원
		
		c1.setR(10);
		c2.setR(6);
		
		c1.calcCircum();
		c1.calcArea();
		
		c2.calcCircum();
		c2.calcArea();
		
		printCircle(c1);
		printCircle(c2);
	}
	
	public static void printCircle(Circle c) {
		System.out.println("============================================");
		System.out.printf("반지름이 %d㎝인 원의 둘레: %.2f㎝\n", c.getR(), c.getCircum());
		System.out.printf("반지름이 %d㎝인 원의 면적: %.2f㎠\n", c.getR(), c.getArea());
	}

}
