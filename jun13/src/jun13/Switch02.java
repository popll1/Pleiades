package jun13;

public class Switch02 {
	public static void main(String[] args) {
		
		int i = 3;
		int k = 1;
// Break; 문이 없을 떄 예제
//     - break가 없을때 아래로 침범한다.
		
		switch(i) {
		case 0:
		case 1:
		case 2:
		case 3:
			k = 0;  //0
			
		case 4:
			k += 3; // 3
		case 5: 
			k -= 10; // -7
		
		default : 
			k--; // -7 -1 = -8
			
		
		}
		System.out.println(k);
	}
}
