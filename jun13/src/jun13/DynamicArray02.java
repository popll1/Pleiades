package jun13;

import java.util.Arrays;

public class DynamicArray02 {
	public static void main(String[] args) {

//		char[][] stars = new char[10][];
//		// 내부 크기를 랜덤하게 잡아주세요. 1~10까지
//
//		for (int i = 0; i < stars.length; i++) {
//			stars[i] = new char[(char) (Math.random()*10) + 1]; 
//			for (int j = 0; j < stars[i].length; j++) {
//				stars[i][j] = '*';
//
//			}
//		}
//
//	for( char[] cs:stars)
//	{
//		System.out.println(Arrays.toString(cs));
System.out.println("==========================");
		


		// 배열복사
		// 깊은복사 , 얇은 복사
		int[] arr03 = new int[] { 50, 40, 30, 20, 10 };
		int[] arr04 = arr03;
		int[] arr05 = arr04;
		arr03[0] = 88;
		System.out.println(Arrays.toString(arr03));
		System.out.println(Arrays.toString(arr04));
	}
}



