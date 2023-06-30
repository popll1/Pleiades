package collection;
// Generic

// 클래스 선언부에 <E>, <T>, < K,V>가 붙어 있는 경우가 있습니다.
// 이런 인터페이스, 추상 클래스 , 클래스를 제네릭 이라고 합니다.
// 자바 1.5부터 추가된 기능입니다.
// <E> element, 구성요소 ( 데이터 타입)을 적습니다.
// <T> Type
// < K,V> Key, Value
// 이 기호를 사용해서 데이터 타입을 선언할 수 있습니다.
// 정해지지 않은 데이터 타입은 제네릭으로부터 객체가 생성될때 결정됩니다.

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList02 {
	public static void main(String[] args) {

		ArrayList<Integer> arr01 = new ArrayList<Integer>();

		for (int i = 10; i < 16; i++) {
			arr01.add(i);

		}
		arr01.add(0, 100); // 0번지에 100을 추가
		// 마지막 번지수에 50,60을 넣어주세요. add(index,e) 이용해서...
		arr01.add(arr01.size(), 50);
		arr01.add(arr01.size(), 60);

		System.out.println(arr01);
		System.out.println(arr01.size());
		System.out.println("-------------------");
		// 삭제 remove()
		System.out.println(arr01.remove(0));// 특정 index를 삭제함
		System.out.println(arr01);
		System.out.println(arr01.size());
		System.out.println(arr01.remove(3));// 특정 index를 삭제함
		System.out.println(arr01);
		System.out.println(arr01.size());
		System.out.println("------------");
		// 다시 집어 넣기
		arr01.add(3, 13);
		System.out.println(arr01);

		ArrayList<String> arr02 = new ArrayList<String>();
		arr02.add("홍길동");
		arr02.add("김길동");
		arr02.add("이길동");
		arr02.add("박길동");

		// remove(value)
		System.out.println(arr02.remove("홍길동"));
		System.out.println(arr02.remove("이상화"));
		System.out.println(arr02.remove("헬로우"));
		System.out.println(arr02.remove("박길동"));
		System.out.println(arr02);

		// indexOf() :
		System.out.println(arr02.indexOf("헬로우"));
		System.out.println(arr02.indexOf("김길동"));
		System.out.println(arr02.indexOf("박길동"));
		System.out.println(arr02.indexOf("홍길동"));
		System.out.println(arr02);
		// contains(value) : 요소에 있는지 확인하기
		Collections.sort(arr02);

		System.out.println(arr02);
//		arr03 
		// 0~9 랜덤하게 5개 저장하는 list를 만들어주세요
		ArrayList<Integer> arr03 = new ArrayList<Integer>();

		for (int i = 0; i < 5; i++) {
			arr03.add((int) (Math.random() * 10));

		}
		System.out.println(arr03);

		Collections.sort(arr03);// 내림차순
		System.out.println(arr03);

		Collections.reverse(arr03);// 랜덤
		System.out.println(arr03);

		Collections.shuffle(arr03); // 랜덤
		System.out.println(arr03);

		System.out.println(arr02.contains("김나래"));

		System.out.println("arr02 출력하기");
		System.out.println(arr02);

     //set(index, value)
		arr02.set(0, "황길동");
		System.out.println("set 활용하기 " + arr02);

		ArrayList<String> arr04 = new ArrayList<String>(arr02);
		System.out.println("arr04 : " + arr04);
		arr02.set(1, "김나래");
		System.out.println("arr02 : " + arr04);
		System.out.println("arr04 : " + arr04);
	}
}
