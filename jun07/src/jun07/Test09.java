package jun07;



//10진법 입력 받아서 2진법으로 출력하기
public class Test09 {
	public static void main(String[] args) {

		int num = 10;

		for (int i = 0; i < 8; i++) {
			// 1. 2나눠서 나머지값을 출력
			System.out.print(num % 2);
			// 2. 2로 나눈 몫을 num에 저장하기
			num = num / 2;

		}
	}
}
