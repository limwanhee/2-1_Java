package test.constructor;

public class ConstructorTest1 {
	private int k;
	//생성자가 하나도 정의가 안되어 있으면 JVM이 실행할 때 기본생성자를 만들어서 사용한다
	//그러나 클래스 내에 생성자가 하나라도 정의가 되어 있으면 정의된 생성자만 호출해서 객체를 생성할 수 있다
	
	public ConstructorTest1() {
		
	}
	
	public ConstructorTest1(int k) {
		this.k = k;
	}
	
	

	public static void main(String[] args) {
		ConstructorTest1 ct1 = new ConstructorTest1(100); 
		ConstructorTest1 ct2 = new ConstructorTest1(500);
		ConstructorTest1 ct3 = new ConstructorTest1();
		
		System.out.printf("ct1이 참조하는 객체의 k필드의 값은 %d\n", ct1.k);
		System.out.printf("ct2가 참조하는 객체의 k필드의 값은 %d\n", ct2.k);
		System.out.printf("ct3이 참조하는 객체의 k필드의 값은 %d\n", ct3.k);
	}

}
