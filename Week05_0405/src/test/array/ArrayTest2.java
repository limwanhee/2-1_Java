package test.array;

public class ArrayTest2 {

	public static void main(String[] args) {
		int[][] arr = new int[2][];
		int n = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[3];
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = n++; 
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
