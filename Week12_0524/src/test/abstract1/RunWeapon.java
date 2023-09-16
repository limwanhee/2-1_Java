package test.abstract1;

public class RunWeapon {

	public static void main(String[] args) {
		//Weapon w = new Weapon(); 추상 클래스는 new 연산자로 객체 생성 불가능
		Solider s = new Solider();
		Tank t = new Tank();
		
		s.reload();
		s.fire();
		
		t.reload();
		t.fire();
		t.forward();
	}

}
