package jun12;

public class Test04 {
	   public static void main(String[] args) {
		      int[] a = new int[8];
		      int i = 0;
		      int n = 10;

		      while ( n> 0) {
		         a[i++] = n%2;
		         
		         n /= 2; //5, 2, 1, 0
		      }
		      
//		      int[] b = new int[8];
//		      int j = 0;
//		      int num = 10;
//		      for(; num > 0 ; ) {
//		    	  b[j++] = num%2;
//		    	  num /= 2;
//		      }

		      for (i = 7; i >= 0; i--) {
		         System.out.print(a[i]);
		      }
		      
//		      for (i = 7; i >= 0; i--) {
//			         System.out.print(b[i]);
//			      }
		   }
}

     