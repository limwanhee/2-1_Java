package ch02.datatype;

public class DataTypeTest {

	public static void main(String[] args) {
		//숫자형: 정수형(byte, short, int, long)
		byte b = 127;
		b = -128; // byte는 127 ~ -128까지
		short s = 5000;// short는 2^15 ~ 2^15-1까지
		s = b; // 묵시적 형변환
		int i = 100000;
		i = s;
		long l = 1000000000;
		l = i;
		i = (int)l; //형변환(캐스팅) 명시적 형변환
		
		//숫자형 : 실수형(float, double) 정수/정수 = 정수 ex) 5/2 = 2.0
		float f = (float)7.53; //float f = 7.53f;
		f = 200;
		f = l;
		double d = 56.77;
		d = i;
		d = 900;
		d = f;
		
		//논리형: boolean(true, false)
		boolean bb = true;
		bb = b==s;
		
		//문자형: char
		char c = 65;
		System.out.println(c);
		System.out.println(c+2);
		c = 'b';
		System.out.println(c);
		System.out.println(c+2);
		System.out.println((char)(c+2));
		//중간고사 단골 문제: 에러나는 위치와 이유 맞추기, 결과 맞추기
		
	}

}
