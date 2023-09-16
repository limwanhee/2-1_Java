package test.dynamic.array;

public class DynamicArrayTest {

	public static void main(String[] args) {
		//int[] num = {3, 1, 5}; 규칙성 없게 열 만들기
		int[][] arr = new int[3][];
		int cnt = 0;
		int i = 0;
		
		for(i = 0; i < arr.length; i++) {
			arr[i] = new int[i+1]; //행마다 열의 객체 생성     규칙성 없게 열 만들기 arr[i] = new int[num[i]];
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ++cnt;
			}
		}
		
		for(i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
