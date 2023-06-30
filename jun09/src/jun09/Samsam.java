package jun09;

import java.util.Arrays;

public class Samsam {
	public static void main(String[] args) {
		
	int[][] sam = new int[3][3];
	
	for (int i = 0; i < sam.length; i++) {//3
		for (int j = 0; j < sam[i].length; j++) {//3
			sam[i][j] = (int) ((Math.random() *9) +1 );
			
		}
	}
			for (int[] is :sam)
			System.out.println(Arrays.toString(is));
			
			
		
	}
}
