package test.for1;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		int n;
		int sum;
		int nu;
		Scanner s = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		
		
		while(true) {
			sum = 0;
			
			System.out.println("수를 입력하세요: ");
			nu = s.nextInt();
			
			for (n = 1; n <= nu; n++) {
				sum += n;
			}
			System.out.println("1부터 " + nu + "까지의 합은 " + sum + "입니다" );
			
			System.out.println("계속 하시겠습니까? (y/n)");
			String end = s2.nextLine();
			
			if(end.equals("n"))
				break;
		}
		s.close();
		s2.close();
	}

}
