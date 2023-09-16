package test.method1;

public class MethodTest3 {
	static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static void main(String[] args) {
		int a = 1000;
		int b = 2000;
		
		System.out.printf("%d + %d = %d\n", a, b, add(a, b));
		
		a = 1234;
		b = 5678;
		
		System.out.printf("%d + %d = %d\n", a, b, add(a, b));
	}

}
