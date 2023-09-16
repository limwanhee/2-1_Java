package test.abstract1;

public class Tank extends Weapon {

	@Override
	public void fire() {
		System.out.println("BoomBoomBoom");

	}
	public void forward() {
		System.out.println("Tank forward");
	}

}
