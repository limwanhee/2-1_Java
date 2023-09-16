package test.this1;

public class RunCircle {
	
	public static void printCircle(Circle c) {
		System.out.printf("원의 반지름 : %d㎝\n",c.getR());
		System.out.printf("원의 둘레 : %.1f㎝\n",c.getCircum());
		System.out.printf("원의 면적 : %.1f㎠\n",c.getArea());
	}

	public static void main(String[] args) {
		Circle c1 = new Circle(15);
		c1.calcCircle();

	}

}
