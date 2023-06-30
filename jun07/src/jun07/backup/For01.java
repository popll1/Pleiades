package jun07.backup;

//별찍기
//2023 -06-07 응용 SW 기초기술 활용
public class For01 {
	public static void main(String[] args) {
//
//		for (int i = 0; i < 5; i++) { // 외부측
//			for (int j = 0; j <= i ; j++) {// 내부측
//
//				System.out.print("*"); // 00
//
//			}
//			System.out.println("");// 엔터같은 효과
//		}
//	}
//}
////1. 역삼각형
//		for (int i = 5; i > 0; i--) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();// 엔터같은 효과
//		}
//	}
//}
		
//		   int size = 5; // 역삼각형의 크기
//
//	        for (int i = size; i > 0; i--) {
//	            for (int j = 0; j < i; j++) {
//						
//					
//	            	System.out.print("*");
//	            }
//	            System.out.println();
//	        }
//	    }
//}

//		
//		----*
//		---**
//		--***
//		-****
//		*****
//	for (int i = 0; i < 5; i++) {//외부측
//		for ( int j = 4; j > i ; j--) {//내부측1
//			System.out.print("_");
//		}//내부측1
//		for (int j = 0; j <= i ;j++) {//내부측2
//			System.out.print("*");
//		}//내부측2
//		System.out.println("");
//	}
//}
//}
		
		for (int i = 3; i > 0 ; i--) {
			for (int j = 0; j < i ; j++) {
				System.out.print("-");
			}
			for (int j = 3; j >= i	; j--) {
				System.out.print("*");
							
			}
//			for (int j = 3; j >= i*2 ; j--) {
//				System.out.print("*");
//			}
//			for (int j = 3; j < i ; j++ ) {
//				System.out.print("*");
//			}
			System.out.println("");
				
			}
		}
			
}