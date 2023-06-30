package jun09;

import java.util.Arrays;

public class MultiArray03 {
	public static void main(String[] args) {
		
		int[][] arr01 = new int[7][7];
		int k = 1;
		for (int i = 0; i < arr01.length; i++) {
			for (int j = 0; j < arr01[i].length; j++) {
				arr01[i][0] = 1;
				arr01[i][6] = 1;
				
				if(i==j) {
					arr01[i][j] = 1;	
				}
				
			}System.out.println(Arrays.toString(arr01[i]));
		}
		
			
			
		/* [0,0,0,0,0,0,0]
		/* [0,0,0,0,0,0,0]
		/* [0,0,0,0,0,0,0]
		/* [0,0,0,0,0,0,0]
		/* [0,0,0,0,0,0,0]
		/* [0,0,0,0,0,0,0]
		/* [0,0,0,0,0,0,0]
		/* [0,0,0,0,0,0,0]*/
	}

}
