package test.others;

import test.access.Base;

public class OtherPackage {
	public void accessTest() {
		Base base = new Base();
		int otherA = base.a;
		base.baseAccess();
	}
}
