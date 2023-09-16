package test.scanner.gwaje;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double w, h;
		double result;
		
		
		System.out.println("몸무게와 키 입력:");
		w = s.nextDouble();
		h = s.nextDouble();
		result = w / Math.pow(h/100, 2);
		
		
		System.out.printf("BMI 결과 : %.2f kg/m2입니다.", result);
		s.close();
		
	}

}
