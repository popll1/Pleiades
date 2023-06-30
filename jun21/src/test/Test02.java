package test;

public class Test02 {
	public static void main(String[] args) {
		int a = 5, b = 0 , c;
		c = b % 5 < 5 ? 1 : 0;
		
		c = c | c <<3; // 논리합 | : 1이 있으면 1 , 없으면  0
		c = a < 5 || c >= 10 ? c -a : c + a;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.printf("%d", c );
		
	
	}
	}
	
	

