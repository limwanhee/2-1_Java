package test.overriding;

public class Bomb extends Weapon {
	@Override
	public void fire() {
		System.out.println("Boom");
		super.fire();
	}
}
