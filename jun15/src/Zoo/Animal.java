package Zoo;
//개, 고양이, 쥐, 말 등등등
	class Ancestor { //개, 고양이,말, 쥐의 선조
		String name;
		int age;
	
		
		void sleep() { 
			System.out.println("ZZZZZ");
		}
	}	
 	class Dog extends Ancestor {
 		
 		
 		}
 	
 	
// 	class Cat1 extends Ancestor {
//
// 		
// 	}

 	class Mouse extends Ancestor {
 		
 		
 	}
 	class Horse extends Ancestor {
 		
 		
 
 		}
 	




public class Animal {
	

	public static void main(String[] args) {
		
		Ancestor[] ani = new Ancestor[4];
		ani[0] = new Cat();
		ani[1] = new Dog();
		ani[2] = new Mouse();
		ani[3] = new Horse();
		
		for (int i = 0; i < ani.length; i++) {
			((Ancestor) ani[i]).sleep();
			
		}
	
		
		
		
		
		
	}
}
