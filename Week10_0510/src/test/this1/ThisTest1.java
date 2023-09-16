package test.this1;

public class ThisTest1 {
	private double num;
	
	public void power(double num) {
		this.num = num * num;
		System.out.printf("%f의 제곱승은 값은 %f이다", num, this.num);
	}
	
	public static void main(String[] args) {
		ThisTest1 t = new ThisTest1();
		int num = 7;
		t.power(num);

	}

}
