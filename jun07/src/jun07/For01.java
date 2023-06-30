package jun07;

// 별찍기, 구구단, 라센
//2023-06-07 응용SW 기초기술 활용
public class For01 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {// 외부측 3
			for (int j = 0; j <= i; j++) {// 내부측 0 : 3
				System.out.print("*");
			}
			System.out.println("");//엔터같은 효과
		}
/*

 *****
 **** -1
 *** -2
 ** -3
 * -4
 
 */
		
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
/*

____*
___**
__***
_****
*****
 */
		
		
		for (int i = 0; i < 5; i++) {// 외부측
			for (int j = 4; j > i; j--) {//스페이스바
				System.out.print("_");
			}
			for (int j = 0; j <= i * 2; j++) {// 여기를 수정해주세요
				System.out.print("*");
			}
			System.out.println("");// 엔터같은 효과
		}
		
		
/*
____*     41
___***    33
__*****   25
_*******  17
********* 09  
 */
		
/*
1 2 3
4 5 6
7 8 9
*/
		

/*
1 4 7 
2 5 8
3 6 9 이것도 되는지.......

 ___* 
 __*** 
 _***** 
 __*** 
 ___* 
          //사물함은 다음주 중에 사용하실 수 있습니다.
           * 배열 
           * 2차원배열
           * switch
           * while
           * do~while
 */
		
		

	}
}
