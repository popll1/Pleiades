package collec;

import java.util.ArrayList;
import java.util.List;

//List<E> : 순서 있어요. 중복 저장 허용해요.
//Set<E> : 순서 없어요. 중복 저장 안해요.
//Map<K, V> : 순서 없어요. 키/값으로 저장해요.

public class Collection01 {
	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(100); // 0 
		list.add(200); // 1
		list.add(300); // 2
		System.out.println(list);
		list.clear();
	
	
		
		System.out.println(list.isEmpty());
	}
}
