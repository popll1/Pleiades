package jun12;

import java.util.Arrays;

//3x3 배열에 1~9까지 숫자 랜덤하게 입력하기
public class Sam {
	public static void main(String[] args) {

		int[][] sam = new int[3][3];
		/*
		 * [0,0] [0,1] 0,2[] [1,0] [1,1] [1,2] [2,0] [2,1] [2,2]
		 */
		int num = 1;
		for (int i = 0; i < sam.length; i++) {
			for (int j = 0; j < sam[i].length; j++) {
				int temp = (int) (Math.random() * 9) + 1;
				System.out.println("뽑은 숫자 :  " + temp);
				// sam[i][j] == temp;
				// boolean 변수로 확인해보기 변경
				boolean check = false;
				Check: for (int k = 0; k < i + 1; k++) {
					for (int k2 = 0; k2 < j + 1; k2++) {
						if (temp == sam[k][k2]) {
							check = true;
							break Check;
						}
						sam[i][j] = temp;
					}
					for (int[] is : sam) {
						System.out.println(Arrays.toString(is));

				} // 검사 for문
//				if (check) {boolean검사
//					j--; //뺴기 = 다시뽑기

				{
				}

			}
			}
		}
	}
}