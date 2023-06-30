package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

// Set : 중복 없어요. index 업서용
// arryLisy : 중복저장 합니다. 순서가 없습니다.
public class Set01 {
	public static void main(String[] args) {

		HashSet<Integer> set01 = new HashSet<Integer>();
		set01.add(100);
		set01.add(101);
		set01.add(102);
		set01.add(103);
		set01.add(103);
		set01.add(103);
		set01.add(103);
		set01.add(102);
		set01.add(101);
		set01.add(107);
		set01.add(103);

		System.out.println(set01.size());
		System.out.println(set01);
		set01.clear();
		System.out.println(set01.size());
		System.out.println(set01);
		System.out.println("--------------");
		while (set01.size() < 6) { 
			set01.add((int) (Math.random()* 45  +1));
		}
			System.out.println(set01.size());
			System.out.println(set01);
		System.out.println("----------------");
			//정렬 -> List로 변경하기
			ArrayList<Integer> lotto = new ArrayList<Integer>();
			Collections.sort(lotto);
			
			for (int i = 0; i < lotto.size(); i++) {
				System.out.println(lotto.get(i));
				
				
			}

	}			
		
		
	}


