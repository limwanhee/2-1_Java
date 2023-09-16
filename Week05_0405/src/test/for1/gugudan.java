package test.for1;

public class gugudan {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%d x %d = %d\t", j, i, i*j);
			}
			System.out.println();
		}
	}
}//구구단 시험 문제에 나옴!
