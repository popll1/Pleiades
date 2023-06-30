import java.util.*;

public class OneWeek01 { private static List<Integer> num;
// OneWeek 클래스 생성

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요.");// 숫자를 입력받음.
		int n = sc.nextInt();// 입력값은 n변수에 저장됨.

		List<Integer> list = new ArrayList<>();
		list.addAll(list(n));
		
		
		for (int i = 0; i < list.size(); i++) {
			list.get(i);
		}
		
		System.out.println("피보나치 수열은 이거야: "+ list);
		for (int num : list) {
				
			
		}
	}

	public static List<Integer> list(int n) { 
		List<Integer> list = new ArrayList<>();
		
		int a = 0;
		int b = 1;
		int sum = 0;
		
		list.add(a);
		
		while (sum <= n) { 
			
			list.add(sum);
			
        sum =  a+b;
        a = b ;
        b = sum;
		}
		
		return list;
	}
}
		
	
		
//		
//		
//		int i = 0; // 변수i는 0으로 초기화
//		while (num(i) <= n) { // n 이하값을 계산
//			i++;// i의 증감식
////    System.out.print(i);
//		}
//
//		int count = i--; // count = i 선언후 -1 감소
//		for (i = 0; i < count; i++) {// conut 값까지 출력
//
//			System.out.print(num(i) + " "); // num이 i값을 가지고 호출, 계산값 출력
//		}
//
//	}
//
//	public static int num(int n) {
//
//		if (n <= 1) {
//			return n; // 1 이하일때  n번째 수를 반환
//		} else {
//			return num(n - 1) + num(n - 2); // 위가 아닐경우 수열계산
//		}
//	}
//}
	

