package jun13;

import java.util.Arrays;
import java.util.Iterator;

//동적 가변(변할수 있다.) 배열
/* 동적 가변배열이란 배열의 길이를 동적으로 필요시에 생성하는 것
 * 동적 가변 배열이 아는 것은 처음부터 배열의 길이를 초기화해서
 * 만들어 사용하지만, 동적 가변 배열 하게 되면 필요시에 생성 후 
 * 사용해야 합니다.
 * 
 */
public class DynamicArray01 {
	public static void main(String[] args) {

		char[][] stars = new char[10][]; // 동적 가변 배열로 선언
		// 모든 집을 돌아다니면서 동적으로 방을 만들어줘야 합니다.

		for (int i = 0; i < stars.length; i++) {
			stars[i] = new char[i + 1]; // ? 2차원배열 = 배열 속 배열
			for (int j = 0; j < stars[i].length; j++) {
				stars[i][j] = '*';

			}
		}
		for (char[] cs : stars) {
			System.out.println(Arrays.toString(cs));
		}

	}

}
