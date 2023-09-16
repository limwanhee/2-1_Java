package test.array;

import java.util.Scanner;

public class ArrayTest1 {

	public static void main(String[] args) {
        String[] subjects = {"국어", "영어", "수학", "화학", "생명"};  
		int[] scores = new int[subjects.length];
		Scanner s = new Scanner(System.in);
		int sum = 0;
		double avg = 0;
		
		System.out.println("과목별 성적 입력");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(subjects[i] + ":");
			scores[i] = s.nextInt();
			sum += scores[i];
		}
		avg = sum / (double)subjects.length;
		
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%s : %d점\t", subjects[i], scores[i]);
		}
		System.out.println();
		System.out.printf("합계 : %d점 평균 : %.2f점", sum, avg);
		
		
		s.close();

	}

}
