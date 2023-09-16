package test.constructorcall;

public class ClsB extends ClsA {
	public ClsB() {
		System.out.println("Constructor ClsB");
	}
	
	public ClsB(int a) {
		System.out.println("Constructor ClsB(int a) : "+ a);
	}
}
