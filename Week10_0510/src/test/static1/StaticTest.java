package test.static1;

public class StaticTest {
	int nonStc; //인스턴스 변수
	static int stc; //클래스 변수
	
	public static void main(String[] args) {	
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		st1.nonStc = 50;
		st2.nonStc = 100;
		
		st1.stc = 77;
		st2.stc = 700;
		
		System.out.printf("st1.nonStc : %d\n", st1.nonStc);
		System.out.printf("st2.nonStc : %d\n", st2.nonStc);
		
		System.out.printf("st1.stc : %d\n", st1.stc);
		System.out.printf("st2.stc : %d\n", st2.stc);
		System.out.printf("st2.stc : %d\n", StaticTest.stc); //클래스명을 붙여서 사용하는걸 추천함!!
	}

}
