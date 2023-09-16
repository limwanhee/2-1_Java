package test.if1;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		String name;
		int grade;
		
		System.out.println("이름 입력: ");
		name = s1.nextLine();
		System.out.println("성적 입력: ");
		grade = s2.nextInt();
		
		if(grade >= 90)
			System.out.println(grade + "점이므로 우수한 성적입니다");
		
		System.out.println(name + "님의 성적은 " + grade + "점입니다");
			
		s1.close();
		s2.close();
	}

}
