package test.constructorcall;

public class ClsC extends ClsB {
	public ClsC() {
		System.out.println("Constructor ClsC");
	}
	
	public ClsC(int a) {
		super(10);
		System.out.println("Constructor ClsC(int a) : "+ a);
	}
}
