package test.if1;

import java.util.Scanner;

public class BMITest {

	public static void main(String[] args) {
		System.out.println("======= BMI(Body Mass Index) =======\n");
		Scanner s = new Scanner(System.in);
		double weight, height, bmi;
		System.out.print("* 체중입력(㎏): ");
		weight = s.nextDouble();
		
		System.out.print("* 키입력(㎝): ");
		height = s.nextDouble();
		
		bmi = weight / Math.pow(height/100, 2);
		
		if(bmi < 18.5) {
			System.out.println("저체중");
		}
		else if(bmi < 23){
			System.out.println("정상");
		}
		else if(bmi < 25){
			System.out.println("비만 전");
		}
		else if(bmi < 30){
			System.out.println("1단계 비만");
		}
		else if(bmi < 35){
			System.out.println("2단계 비만");
		}
		else {
			System.out.println("3단계 비만");
		}
		
		
		System.out.printf("* 당신의 BMI 지수는 %.2f ㎏/㎡입니다.", bmi);
		
		s.close();
	}

}
