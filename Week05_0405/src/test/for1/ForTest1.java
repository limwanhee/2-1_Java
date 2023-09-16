package test.for1;

public class ForTest1 {

	public static void main(String[] args) {
		int i = 0;
		
		for(i = 0; i < 100; i++) {
			System.out.println(i+1);
			if((i + 1) % 10 == 0) {
				System.out.println("\t");
			}
		}
	}
}
