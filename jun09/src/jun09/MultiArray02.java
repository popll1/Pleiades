package jun09;

import java.util.Arrays;

public class MultiArray02 {
	public static void main(String[] args) {

		// 1~25 5 X 5
//		int [] arr01 = new int[5];
		int[][] arr01 = new int[5][5];
		int k = 1 ; 
//		int[][] arr01 = null;
		for (int i = 0; i < arr01.length; i++) {
			for (int j = 0; j < arr01.length; j++) {
				arr01[i][j] = k++;
					
				}	
				}
		for (int[] is : arr01) {
			for (int i : is) {
				System.out.print(i + " ");
			
					
			}
			System.out.println("");
		}
		System.out.println("========================");
		for (int[] is : arr01) {
			System.out.println(Arrays.toString(is));
		
		}
		System.out.println("========================");
		
		for (int i = 0; i < arr01.length; i ++) {
			System.out.println(Arrays.toString(arr01[i]));
		}
//		//[1 , 10, 15, 20]
//		System.out.println(Arrays.toString(arr01)); // 
//		//[[I@515f550a, [I@626b2d4a, [I@5e91993f, [I@1c4af82c, [I@379619aa]
	
	}

}

