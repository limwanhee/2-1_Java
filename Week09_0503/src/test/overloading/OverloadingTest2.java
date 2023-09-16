package test.overloading;

public class OverloadingTest2 {
	public int calc(int n1, int n2) {
		return n1 * n2;
	}
	
	public double calc(double n1, double n2) {
		return n1 + n2;
	}
	
	public static void main(String[] args) {
		OverloadingTest2 ot2 = new OverloadingTest2();
		
		System.out.printf("calc(10, 20)의 결과: %d\n", ot2.calc(10, 20));
		System.out.printf("calc(50.0, 20.5)의 결과: %f\n", ot2.calc(50.0, 20.5));
		System.out.printf("calc(50, 20.5)의 결과: %f", ot2.calc(50, 20.5));
	}
}
