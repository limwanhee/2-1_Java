package test.overriding;

public class RunWeapon {

	public static void main(String[] args) {
		Bomb b = new Bomb();
		Laser l = new Laser();
		
		b.fire();
		l.fire();

	}

}
