package jun14;

import java.util.Scanner;

// TEST 문제
/*
1. 가위 바위보 게임을 만들어주세요.
1. 10번 게임을 합니다.
2. 사용자가 1 가위 2 바위 3 보 중 하나 선택 
3. 컴퓨터는 랜덤으로 1~3을 뽑아서 비교하기
4. 승패를 저장합니다.
5. 10번 게임이 끝나면 승률을 출력해주세요  

예 ) 5승 2패 3비김 승률 : 75%
*/
public class Test01 {
	public static void main(String[] args) {

		int input = 0;
		int count = 10;

		for (int i = 0; i < 10; i++) {

			System.out.println("게임을 시작합니다.");
			System.out.println("아래중 하나를 선택하시오.");
			System.out.println("1.가위\t2.바위\t3.보\t ");

			Scanner sc = new Scanner(System.in);
			input = sc.nextInt();

			int Com1 = (int) ((Math.random() * 3) + 1);
			System.out.println("컴퓨터 : " +Com1);

			if (input == Com1) {
				System.out.println("무승부");
				continue;
			} else if ((input == 1 && Com1 == 3) || (input == 2 && Com1 == 1) || (input == 3 && Com1 == 2)) {
				System.out.println("사용자 승리");
				continue;
			} else {
				System.out.println("사용자패배");
				continue;
			}
		}
		int Rate = input  %10 * count  ;
		
		System.out.println("승률" + Rate + "%");

	}
}