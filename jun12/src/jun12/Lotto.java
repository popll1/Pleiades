package jun12;

import java.util.Arrays;

//중복 없이 로또 번호 뽑기
public class Lotto {
	public static void main(String[] args) {

		int[] lotto = new int[6];

		for (int i = 0; i < 6; i++) {
			lotto[i] = ((int) (Math.random() * 45 ) + 1);

			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					lotto[i] = ((int) (Math.random() * 45) + 1);

				}

			}

		}
		System.out.println(Arrays.toString(lotto));

	}

}

// 내일 해야 할 것

// 동적 가변배열, 배열 복사, 객체 지향
