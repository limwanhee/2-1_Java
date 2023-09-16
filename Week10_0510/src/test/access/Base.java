package test.access;

public class Base {
// 클래스 선언부에 접근 지정자가 public일때: 모든 패키지에서 접근 가능
// 클래스 선언부에 접근 지정자가 default(생략)일때: 같은 패키지에서 접근 가능	
	public int a = 10;
	
	public void baseAccess() {
		System.out.println("a : "+ a);
	}
}
