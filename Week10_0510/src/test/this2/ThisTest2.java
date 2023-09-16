package test.this2;

public class ThisTest2 {
	private int n;
	
	public ThisTest2() {
		this(10);
		System.out.println("This is default constructor");
	}
	
	public ThisTest2(int n) {
		this.n = n + 10;
		System.out.println("This is ThisTest2(int n) constructor:"+this.n);
	}
	
	public static void main(String[] args) {
		new ThisTest2();
	}
}
