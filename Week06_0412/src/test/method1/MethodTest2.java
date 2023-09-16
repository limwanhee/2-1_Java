package test.method1;

public class MethodTest2 {
	static void add(int a, int b) {
		int sum = a + b;
		System.out.printf("%d + %d = %d\n", a, b, sum);
	}

	public static void main(String[] args) {
		add(250, 495);
		add(1234, 5678);
	}

}
