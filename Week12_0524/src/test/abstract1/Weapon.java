package test.abstract1;

public abstract class Weapon {
	int count = 10;
	public void reload() {
		System.out.println("Weapon reloading....");
	}
	
	public abstract void fire();
}
