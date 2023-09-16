package test.protacted1;

import test.other.Parent;

public class Child extends Parent {
	public void modifierTest() {
		//패키지가 다른 부모 클래스일 경우 : protected도 접근 가능
		addr = "경기도 시흥시 포동";
		//name = "임완희"; (오류)
		
	}
}
