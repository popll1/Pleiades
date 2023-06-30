package jun15;

import java.util.Random;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {

		Random random = new Random();
		int answer = random.nextInt(100) + 1; // 1부터 100까지의 랜덤 숫자 생
		Scanner scanner = new Scanner(System.in);

			System.out.println("1 ~100 까지 입력하세요");

		while (true) {
			System.out.println("숫자를 입력하시오: ");

			int guess = scanner.nextInt();

			if (guess > answer) {
				System.out.println("DOWN");
			} else if (guess < answer) {
				System.out.println("UP");
			} else {
				System.out.println("정답입니다!");
				break;
			}
		}

	}

}
