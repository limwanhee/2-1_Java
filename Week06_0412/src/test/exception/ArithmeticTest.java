package test.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1 = 0, n2 = 0;
		
		try {	
			System.out.print("* 분자 입력");
			n1 = s.nextInt();
			
			System.out.print("* 분모 입력");
			n2 = s.nextInt();
		
//		double result = (double)n1 / n2;
//		System.out.printf("%d ÷ %d = %.2f\n", n1, n2, result);
	
	
		System.out.printf("%d ÷ %d = %.2f\n", n1, n2, n1/n2);
	}catch(ArithmeticException e) {
		System.out.println("정수는 0으로 나누면 안됩니다");
		System.out.print("* 분모 입력");
		n2 = s.nextInt();
		System.out.printf("%d ÷ %d = %d\n", n1, n2, n1/n2);
	}catch(Exception e) {
		System.out.println("정수만 입력해주세요!");
	}finally {
		System.out.println("프로그램 종료!!");
	}
		s.close();
	}

}
