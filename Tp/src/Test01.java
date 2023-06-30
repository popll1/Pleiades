import java.util.Random;
import java.util.Scanner;

public class Test01 {

	    public static void main(String[] args) {
	        Random random = new Random();
	        int answer = random.nextInt(100) + 1; // 1부터 100까지의 랜덤 숫자 생성
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("1부터 100 사이의 숫자를 맞춰보세요!");

	        while (true) {
	            System.out.print("숫자를 입력하세요: ");
	            int guess = scanner.nextInt();

	            if (guess > answer) {
	                System.out.println("DOWN");
	            } else if (guess < answer) {
	                System.out.println("UP");
	            } else {
	                System.out.println("정답입니다!");
	                break;
	            }
	        }

	        scanner.close();
	    }
	}

