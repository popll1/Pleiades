package jun13;

import java.util.Scanner;

public class Switch04 {
	public static void main(String[] args) {
		
	
	int input;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("직급을 선택하시오");
	System.out.println("1. 인턴\t 2.대리\t 3.과장 \t 4.부장 \t 5.사장");
	
	input = sc.nextInt();
	
	System.out.println("당신이 올라갈수 있는 층은");
	
	switch (input) {
	case 5:
		System.out.print("5층, ");
		
	case 4:
		
		System.out.print("4층, ");
	case 3:
		System.out.print("3층, ");
	case 2:
		System.out.print("2층, ");
	
		
	default:
		System.out.println("1층입니다.");
		break;
	}
}

}