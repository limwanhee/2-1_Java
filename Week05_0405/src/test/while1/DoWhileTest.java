package test.while1;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("반복 횟수 입력: ");
		int num = s.nextInt();
		int i = 0;
		do {
			System.out.println("do~while문을 사용하여 반복합니다.");
			i++;
		}while(i < num);
		
		s.close();
	}

}
