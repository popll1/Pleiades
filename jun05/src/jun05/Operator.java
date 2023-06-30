package jun05;

// 연산자 : 계산에 사용되는 기호
/*
1. 최우선. (점) [](배열), ()(괄호)
2. 단항 !(반전), ~(비트반전), +/-(부호연산), ++/--(선행증감)
3. 산술  +	-	/	*	%(모듈러)
4. 쉬프트 <<, >>, >>>
5. 관계 >, <, >=, <=, ==(같아?? 비교??), !=(달라?)
6. 비트 &(and), |(or), ^(xor)
7. 논리 &&, ||(or)
8. 삼항	조건식 ? 참일때 : 거짓일때;
9. 대입 = , +=, -=, /=, %= , 많아요....
10. ++//-- (후행증감)

 */
public class Operator {
	public static void main(String[] args) {
			// 정수 기본타입으로 number에다가 1이라고 저장해주세요
		int number = 1 ;
		//int num2 = num2 + --number;   <-- num2 value 가 선언이 되지않았기때문에 error
		int num2 = --number + 10;
		//       3       1  2 
		int num3 = ++number + --num2;
		//       3     1    2     1
		System.out.println(number);	
		System.out.println(num2);					
		System.out.println(num3);	
		
		
		number = num2 = num3 = 0 ;
		number = num2-- + num3++;
		//     3    10  2    10
		System.out.println(number);	//0
		System.out.println(num2);	//-1				
		System.out.println(num3); 	//1
		
	    boolean check = false;
	    check = 1 + 2 != 4;
	    
	    System.out.println(check);
	    
	    check = number ==num2; 
	    //    2         1 
	    
	    number = 40; //101000
	    number = number >> 2; //1010
	    System.out.println(number); //10
	    //2, 8 , 16진법 입력하기
	    //10	0   1		2		3		4		5		6		7		8		9		10                 15  16  17
	    //2		0 	1		10		11		100		101		110		111		1000	1001	1010
	    //8		0	1		2		3		4		5		6		7		10		11		12
	    //16	0 	1		2		3		4		5		6		7		8		9		A	B	C	D	E	F  10  11
	   
	    System.out.println(Integer.toBinaryString(11)); // 10진수를 2진수로 바꿔줄때
	    System.out.println(Integer.toOctalString(16));	// 10진수를 8진법으로 바꿔줄때
	    System.out.println(Integer.toHexString(27));		// 10진수를 16진법으로 바꿔줄때
	    
	    //입력 
	    num2 = 10;//10 진법
	    System.out.println(num2);
	    num2 = 0B10; // 2진법 입력 0B바이너리 입력
	    System.out.println(num2);
	    
	    num2 = 010; //8진법 0을 입력 한 후 0진법 입력
	    System.out.println(num2);
	    
	    num2 = 0X20; //16진법 **************
	    System.out.println(num2);
	    //비트 반전 ~
	    System.out.println(Integer.toBinaryString(2));
	    System.out.println(Integer.toBinaryString(~2));
	    //00000000000000000000000000000010
	    //11111111111111111111111111111101  = -5
	    
	    System.out.println(Integer.toBinaryString(-5));
	    //11111111111111111111111111111011
	    System.out.println(0B11111111111111111111111111111011);
	    System.out.println(~-5);
	    
	    number = num2 = num3 = 0;
	    number = 2;	//0010
	    num2 = 8;   //1000
	    			//1010
	    
	    num3 = number & num2; //둘 다 1일때 1
	    System.out.println(num3); 
	    
	    num3 = number | num2; // 하나라도 1이 있으면 1
	    System.out.println(num3); 
	    
	    num3 = number ^ num2; // 서로 값이 다를 때 1 같을때 0
	    System.out.println(num3);
	    
	    //논리 연산자
	    // 		왼쪽 && 오른쪽 = 둘다 참일 때 참
	    System.out.println( 1 + 2 == 4 && 1 + 3 == 4 );
	    System.out.println( 1 + 2 == 3 && 1 + 2 == 4 );
	    System.out.println( !(1 + 2 == 3) && 1 + 3 == 4 );
	    System.out.println( !(1 + 2 == 4) && 1 + 2 == 3 );
	    // 참 $$ 거짓 = 거짓
	    // 거짓 $$ 참 = 거짓
	    // 거짓 $$ 거짓 = 거짓
	    // 참 && 참 = 참
	    
	    // || 둘 중 하나면 참이면 참입니다.
	    System.out.println( true || false );
	    System.out.println( false || false);
	    System.out.println( false || true);
	    System.out.println( true || true );
	

	   
	    /*
	       if(조건식) {
	    
	    	참일때 실행할 명령어;
	    	
	    } else {
	    	조건이 거짓일때 실행할 명령어;
	    }
	   조건식 ? 참일때 : 거짓;
	   */
	    
	    number = 1;
	    System.out.println(number == 1 ? "1입니다." : "2입니다.");
	    
	    //위는 아래와 같음
	    if(number == 1) {
	    	System.out.println("1입니다.");
	    	
	    } else { 
	    	System.out.println("2입니다.");
	    }
	    
	    check = number == 1 ? true : false;
	    System.out.println(check);
	    
	   /////////////////////////////////////////////////
	    check = false;
	    number =1 ;
	    
	    /*
	    check = number >> 1 || number == 1 ? true : false ;
	    System.out.println(check);
	    */
	}

}
