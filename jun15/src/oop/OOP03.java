package oop;
class Test { 
	public int variable(int num) {
		int a = 10;
		a++;
		return a;
		
	}
	
}
	
	
	public class OOP03 {
			public static void main(String[] args) {
				
				Test t = new Test();
				int a = 0;  // int = 0
				a = t.variable(a); // Test 클래스에 a =10  ++(+1)  이므로
				System.out.println(a);//11 입니다.
			
			
			
			}
}

