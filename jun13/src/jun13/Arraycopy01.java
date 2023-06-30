package jun13;

import java.util.Arrays;

//배열복사
//깊은복사
//얕은 복사	
public class Arraycopy01 {
	public static void main(String[] args) {

		int[] arr01 = {50, 100, 150};
		int[] arr02 = new int[3];
		
		System.arraycopy(arr01, 0, arr02, 0, 3);
		/* src : 원본대상
		 * srcPso : 원본의 어느 위치부터 읽어올 것인지
		 * dest : 값을 담을 배열
		 * DestPos : 어느 위치에 저장할 것인지
		 * length : 어느 길이만큼 읽어올 것인지 = 배열의 길이 
		 */
			
		
		arr01[0] = 9;
		
		
		System.out.println(Arrays.toString(arr01));
		System.out.println(Arrays.toString(arr02));
		
		int[] arr03 = new int[5]; //[0, 0, 50, 100, 150]
		int[] arr04 = {0, 0, 50, 100, 150};
		
		System.out.println(Arrays.toString(arr04));
		System.out.println("====================");
		System.arraycopy(arr04, 0, arr03, 0, 5);
		System.out.println(Arrays.toString(arr04));
		
		System.out.println("===================");
		int[] arr05 = {10, 20, 30, 40, 50};
		int[] arr06 = new int[5];
		//arr06 값을 { 0 , 20 ,30, 40, 0}; 이 되게 arrycopy 써주세요
	
		System.arraycopy(arr05, 2, arr06, 1, 3);
		System.out.println(Arrays.toString(arr06));
	}
}
