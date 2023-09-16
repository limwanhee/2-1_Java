package test.operator.condition;

public class ThreeOperand {

	public static void main(String[] args) {
		int n1 = 10, n2 = 20;
		int max = 0;
		
		//max = n1 > n2 ? n1 : n2;
		
		if(n1 > n2) {
			max = n1;
		}
		else {
			max = n2;
		}
		
		System.out.printf("%d과(와) %d 중 더 큰 수는 %d입니다.\n", n1, n2, max);
		System.out.println("두 수 중 더 큰 수는 "+ max +"입니다.");
		
	}

}
