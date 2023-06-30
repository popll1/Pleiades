package jun08;
// 2~9단 까지 for 문으로 출력하기
public class Test02 {	
	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
//			System.out.printf("2 x %d = %d \n", i, (2 * i));
			for (int j = 2; j < 10; j++) {
				System.out.printf(" %d x %d = %d \t", j, i,  (j * i ));
			}
			System.out.println("");
			
		}
	}
}
