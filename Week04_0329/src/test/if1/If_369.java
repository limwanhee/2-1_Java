package test.if1;

import java.util.Scanner;

public class If_369 {

	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);

		System.out.print("숫자를 입력하세요: ");
		num = s.nextInt();
		
		if(num > 100)
			System.out.println("369 게임은 100 이하의 숫자로 운영됩니다");
		else if((num % 3 == 0) || (num % 10 == 3) || (num/10 == 3))
			System.out.println("박수 짝!");
		else
			System.out.println(num);

	}

}
