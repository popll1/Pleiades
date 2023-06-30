package collection;

import java.util.ArrayList;

// 자료구조
// 컬렉션 하위 arrayList타입
// 이름도 배열이 들어갑니다. 배열과 흡사합니다.
// 배열보다 쉬웡

public class ArrayList01 {
	public static void main(String[] args) {
		//배열 선언
		int[] arr = new int[10];
		
		// List -> ArrayList
		ArrayList<Integer> arr01 = new ArrayList<Integer>();
		
		// 값대입 = add()
		arr01.add(10);
		arr01.add(15); //arr01 [ 10 , 15 ....]
		arr01.add(20); //arr01 [ 10 , 15 , 20 .......]
		int num = 100;
		arr01.add(num);
		
		for (int i = 1; i < 11; i++) {
			arr01.add(i);
		}
		
		System.out.println(arr01);
		
		
		//get
		
		int num1 = arr01.get(0);
		System.out.println(num1);
		System.out.println(arr01.get(3));
		//길이뽑기
		System.out.println(arr01.size()); // list 의 길이 14
		// 마지막 index에 저장된 10을 출력하려고 한다면?
		System.out.println(arr01.get(14-13));
		System.out.println("=====================");
		//for 문 이용해서 출력하기
		for (int i = 0; i < arr01.size(); i++) {
			System.out.println(arr01.get(i));
			
			
		}
		//List 타입 arr02 라고 만들어주세요
		System.out.println("-------------------");
		//홀수를 저장하되 저장된 값이 20개가 되면 멈춰주세요.
		//출력해주세요
		ArrayList<Integer> arr02 = new ArrayList<Integer>();
		int number = 1;
//		for (int i = 0; i < 21; i++) {
			while ( arr02.size() < 20) {
			arr02.add(number);
			number += 2;
			System.out.print(arr02);
			
			
		}
		
	}
}
