package jun09;
//2 차원 배열

// 배열안의 배열
public class MultiArray01 {
	public static void main(String[] args) {
		int[] arr01 = new int[5];
		int[][] arr02 = new int[5][5];

		// 입력
		arr01[0] = 100;
		arr02[0][0] = 100;// [집][방번호]
		// 마지막 집, 마지막 방에 1000에 저장하기
		arr02[4][4] = 1000;
		// index 2, index 마지막 방에 55를 저장하기
		arr02[2][4] = 55;

		for (int i = 0; i < arr02.length; i++) {
			for (int j = 0; j < arr02.length; j++) {
				System.out.print(arr02[i][j] + " ");
			}
			System.out.println("");

		}

		System.out.println("===============");
		int[][] arr03 = new int[2][3];
		; // 6 칸

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr03[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println(arr03.length);// 2
		System.out.println(arr03[0].length);// 3

		int[] temp = arr03[0];
		System.out.println(temp.length);
		
		System.out.println("===================");
		
		int[][] arr04 = new int[3][2];
		
		for (int i = 0; i < arr04.length; i++) {
			for (int j = 0; j < arr04[i].length; j++) {
				System.out.print(arr04[i][j] + " ");
			}
			System.out.println(" ");
		}
		

	}

}
