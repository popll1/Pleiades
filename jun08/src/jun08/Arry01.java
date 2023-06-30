package jun08;

import java.util.Arrays;
import java.util.Scanner;

// 배열 : 같은 데이터 타입이 줄줄이 있습니다.
// 같은 타입, 동일관리, 주소호출
public class Arry01 {
	public static void main(String[] args) {
		/*
		 * int num = 10; int num2 = 11; int num3 = 12; int num4 = 13; int num5 = 14;
		 * System.out.println(num); System.out.println(num2); System.out.println(num3);
		 * System.out.println(num4); System.out.println(num5);
		 */

		// int 타입의 10개 공간을 만들겠습니다.
		// 데이터타입 변수명 = 값;
		int[] arr01 = new int[10];
		// 더블형태의 배열 5칸짜리를 생성해주세요 = arry02
		double[] arr02 = new double[5];
		// 문자열 3개를 저장하는 arr03 배열을 만들어주세요.
		String[] arr03 = new String[3];

		System.out.println(arr01);// [I@3d012ddd
		// 출력 [위치, index]를 적어줍니다.
		arr01[0] = 100;
		arr01[1] = 50;
		arr01[2] = 25;

		arr03[0] = "홍길동";
		arr03[1] = "김길동";
		arr03[2] = "이길동";
		// arr03[3] = "박길동";//배열의 길이 3 --> 0, 1, 2
		// 마지막 번지 = 길이 - 1

		System.out.println(arr01[00]);
		System.out.println(arr01[01]);
		System.out.println(arr01[01]);

		System.out.println(arr03[0]); // 변수[int index]
		System.out.println(arr03[1]); // 변수[int index]
		System.out.println(arr03[2]); // 변수[int index]

		System.out.println("=================");
		System.out.println(arr03.length);// 길이 출력 int;

		for (int i = 0; i < arr03.length; i++) {
			System.out.println(arr03[i]);

		}
		//int[10] 1~10 까지 입력하기
		for (int i = 0; i < arr01.length; i++) {// 0~9
			arr01[i] = i + 1;
		}
		//배열 전체 출력해보기 = arrys 클래스 적용
		
		System.out.println(Arrays.toString(arr01));
		System.out.println(Arrays.toString(arr02));
		System.out.println(Arrays.toString(arr03));
		//초기값 = 객체는 객체 생성과 동시에 초기값을 가집니다.
		//정수 = 0, 실수 = 0.0, 객체 = null, char = , boolean = false 
		
		int[] test01 = new int[3];
		System.out.println(Arrays.toString(test01));
		byte[] test02 = new byte[3];
		System.out.println(Arrays.toString(test02));
		short[] test03 = new short[3];
		System.out.println(Arrays.toString(test03));
		long[] test04 = new long[3];
		System.out.println(Arrays.toString(test04));
		
		float[] test05 = new float[3];
		System.out.println(Arrays.toString(test05));
		
		char[] test06 = new char[3];
		System.out.println(Arrays.toString(test06));
		//[ , , ] 
		
		String[] test07 = new String[3];
		System.out.println(Arrays.toString(test07));
		
		Scanner[] test08 = new Scanner[3];
		System.out.println(Arrays.toString(test08));
		
		Object[] test09 = new Object[3];
		System.out.println(Arrays.toString(test09));
		
		}
}
