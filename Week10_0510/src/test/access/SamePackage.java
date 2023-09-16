package test.access;

public class SamePackage {
	public void accessTest() {
		Base base = new Base();
		int sameA = base.a;
		base.baseAccess();
	}
}
