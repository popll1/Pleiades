package jun12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMyself {

	public static void main(String[] args) {
		// 3x3 배열 생성
		int[][] arr = new int[3][3];
		int index = 0;

		// 1부터 9까지의 숫자 리스트 생성

		for (int i = 1; i <= 9; i++) {
			for (int i1 = 0; i1 < 3; i1++) {
				int index1 = (int) (Math.random() * 9) + 1;
				for (int j = 0; j < 3; j++) {
					arr[i1][j] = index1;
					index1++;

				}

				// 배열에 숫자 입력
			}
		}

		// 결과 출력
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
