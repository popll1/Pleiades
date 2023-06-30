package jun02;

//데이터 타입
/*
 *  프로그램에서는 변수, 상수에 값을 담기 위해서는
 *  반대시 그 값의 타입에 맞는 변수를 사용해야 합니다.
 *  이를 데이터타입이라고 합니다.
 *  
 *  데이터 타입은 크게 R타입(Reference Type, 참조타입)과
 *  P타입(primitive Type, 기본 타입)이 있습니다.
 *   # 이중에 P타입에 대해서 보겠습니다.
 * 
 *  기본타입은 다시 분류됩니다.
 *  각 타입마다 메모리 크기가 엄격하게 제한됩니다.
 *  
 *  
 *  정수 타입
 *  	byte
 *  	short
 *  	int
 *  	long
 * 
 *  실수 타입
 * 		float
 * 		double 
 * 
 *  문자 타입 = 글자 한글자 = A, 가
 *  	Char
 *  
 *  논리 타입 = true / false 
 *  	boolean
 *  
 * 
 * 
 * 
 * 
 * 
 */
public class DataType02 {
	// 파일명과 동일한 클래스 앞에 public를 붙여 줍니다.
	// Ex : class Apple{
	// 접근 제어자
	public static void main(String[] args) {
		byte bNumber = (byte) 111111111; // -128 ~0~127
		System.out.println(bNumber);
		/*
		 * 프로모션 / 캐스트 프로모션 : 변수를 대입할 때 작은 타입을 큰 타입에 대입하는 형태 = 자동 대입
		 * 
		 * 캐스트 : 큰 타입을 작은 타입에 대입할 때 범위를 초과하므로 반드시 해야하는 연산 (type)을 명기해서 값을 대입시킵니다. 이때 주의할
		 * 점은 상위 비트를 대입되는 값의 변화가 올 수 있습니다.
		 * 
		 */
		short sNum = 32767 - 1;
		System.out.println(sNum);
		long iNum = 2147483648L;

		iNum = Integer.MAX_VALUE;
		System.out.println(iNum);
		iNum = Integer.MIN_VALUE;
		System.out.println(iNum);

		long lnum = 922337203685477580L;
		System.out.println(lnum);

		System.out.println(Long.MIN_VALUE);

		iNum = lnum;

		float fNum = 3.14F;// 표식자
		double dNum = 3.14;
		//iNum 	=  fNum;
		// 정수보다 실수를 더 큰수로 인지 합니다.
		lnum = (long) fNum;
		// byte < short < int < long < float < double
		
	}
}
