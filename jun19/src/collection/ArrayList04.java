package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList04 {
	public static void main(String[] args) {
		//arr01을 만들어주세요.
		//6칸, 1~45를 넣어주세요.
		//중복이 있다면 제거해주세요.
		
		 //indexOf(value) : 해당 값이 있는 index 반환
	      //contains(value) : 해당 값이 있으면 참, 없으면 거짓
	      ArrayList<Integer> arr01 = new ArrayList<Integer>(); //arrlist 는 10개기본적으로 생성
	      
	      while(arr01.size() < 6) { //0,1,2,3,4,5
	         int num = (int)(Math.random() * 45) + 1;
	         if(!arr01.contains(num)) {  //contains()함수는 대상 문자열에 특정 문자열이 포함되어있느지 확인하는 함수이다.
	            arr01.add(num);
	         }
	      }
	      
	      Collections.sort(arr01);
	      System.out.println(arr01);
	      
	      
//
//		
//		
//		
//		ArrayList<Integer> arr01 = new ArrayList<Integer>();
//		arr01.add(45);
//		arr01.add(40);
//		//indexOf((Integer) 45)
//		System.out.println(arr01.indexOf((Integer) 45));
//		System.out.println(arr01.indexOf(40));
//		System.out.println(arr01.indexOf(10));
//		//contains((Integer) 40)
//		System.out.println(arr01.contains(45));
//		System.out.println(arr01.contains(40));
//		System.out.println(arr01.contains(10));
//	
	}
}
