package test.while1;

import java.util.Scanner;

public class WhileTest1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("성명 입력: ");
			String name = s.nextLine();
			System.out.println(name + "님 환영합니다.");
			System.out.println("계속하시겠습니까? (y/n)");
			String bool = s.nextLine();
			if (bool.equals("n"))
				break;
		}
		
		s.close();
	
	}

}
