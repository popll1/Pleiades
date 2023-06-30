package jun09;
// 자바의 랜덤(난수) = 로또..
public class Test02 {
	public static void main(String[] args) {
		
		
		//1. 랜덤 Math.random();
		for (int i = 0; i < 6; i++) {
			System.out.print( (int) (Math.random() * 45 + 1));
			System.out.print(", ");
				// 0 ~ 44
		}
		System.out.println("-----------------");	

		for (int i = 0; i < 25 ; i++) {
			System.out.print((int) (Math.random() * 25 + 1));
			System.out.print(" , ");
			
		}
		
	}		
	}

