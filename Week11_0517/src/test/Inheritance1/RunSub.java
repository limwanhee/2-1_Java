package test.Inheritance1;

public class RunSub {

	public static void main(String[] args) {
		SubClass sub = new SubClass();
		sub.name = "임완희";
		sub.age = 21;
		sub.schoolName = "유한대학교";
		sub.addr = "경기도 시흥시 포동";
		sub.phoneNumber = "010-2476-****";
		
		System.out.printf("이름 : %s\n", sub.name);
		System.out.printf("나이 : %d\n", sub.age);
		System.out.printf("학교 이름 : %s\n", sub.schoolName);
		System.out.printf("주소 : %s\n", sub.addr);
		System.out.printf("전화번호 : %s\n", sub.phoneNumber);
	}

}
