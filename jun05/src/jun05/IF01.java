package jun05;
//if
/*
 * 자바의 제어문
 * 	조건문 : 조건에 따라 분기되는 문장
 * 		if, switch
 * 
 *  반목문 : 특정 명령어를 반복적으로 수행하는 문장
 *  	for, while, do ~ while
 *  
 *  if(조건식){ 
 *  		조건식이 참일때 실행할 명령
 * 		{
 * 
 * 	
 * if(조건식){
 * 			조건식이 참일때 실행할 명령;
 * 		}else{
 * 			조건식이 거짓일 때 실행할 명령;
 * }
 * 		
 * 
 *  조건식에 들어가는 것들 : 
 *  
 *  결과가 참 또는 거짓이 되는 문장?
 *  boolean : true / false
 *  부등호 : 1 > 5
 *  1 ==2
 *  1 + 2 == 4
 * 
 */
public class IF01 {
	public static void main(String[] args) {
		
		boolean ch = !true;
		int number = 6;
		
		if ( number == 5) {
			System.out.println("조건식 1이 참 입니다");
	    } else if (number ==4){
			System.out.println("조건식 2가 참입니다.");
	    } else  { 
	    	System.out.println("조건식1, 2 모두 거짓");
		
	    }
	
	}
}

		//중첩
		//if() { 
		//	if() { 
		//if() { 
		//}
		//	}
		//}
	