package accesss;

import inheritance.Inheritance;
                   
//접근제어자
/*
 * 자바에서는 API를 사용할 때 제어자에 따라서 접근 허용여부가 달라집니다.
 * 접근제어자는 크기순서대로
 * 
 * public > protected > default > private
 * 
 * 위 접근제어자는 클래스 선언, 생성자, 선언, 메소드 선언, 필드 선언할때
 * 사용합니다.
 * 
 * 이 중 클래스는 public default(생략)만 사용할 수 있습니다.
 * 
 * public : 접근 범위가 가장 큰 제어자
 * 			다른 패키지에서도 접근이 가능합니다.
 * 
 * protected	: 상속 받은 자식 클래스만 다른 클래스에서 접근 가능
 *				기본적으로 같은 패키지 내에서는 접근 가능합니다.
 *
 * default		: 제어자를 선언하지 않을 때 자동으로 선언됩니다.
 * (생략)		같은 패키지 내에서만 접근 가능합니다.
 * 
 * private		: 자신의 클래스에서만 접근가능
 * 				다른 클래스에서 접근 불가.
 *  				
 *
 */


public class AccessModifier { //클래스에 접근할때
		//필드에 접근할때
		// 생성자에 접근할때
		// 메소드에 접근할때
	
	public static void main(String[] args) {
		//다른 패키지에 있는 클래스를 호출 합니다.
		Inheritance i = new Inheritance();
//		                    		i.print();
		
 	}

}
