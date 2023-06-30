package jun09;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		int[] arr01 = new int[5];
	  
	    
//		//arr01[arr01.length - 1] = 100;
		
		Scanner sc = new Scanner(System.in);
			
//		for (int i = 0; i < arr01.length; i++) {
			
		System.out.println("점수를 입력하세요 : ");
		arr01[1] = sc.nextInt();
//		
	//}
//		
//		System.out.println(Arrays.toString(arr01));
//			for (int i = 0; i < arr01.length; i++) {
//				
//			} //forEach 향상 for문
			for (int i : arr01) {
				// 요소: 집합		집합을 구성하는 요소를 하나씩 변환
				System.out.print(i + " ");
				
			}
		
		}
		
		
		
	}


	
		