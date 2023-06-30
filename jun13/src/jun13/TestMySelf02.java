package jun13;

import java.util.Scanner;
import java.util.Random;

public class TestMySelf02 {
    public static void main(String[] args) {
		
	
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int gameCount = 10;
        int userWins = 0;
        
        for (int i = 0; i < gameCount; i++) {
            System.out.print("가위(1), 바위(2), 보(3) 중 하나를 선택하세요: ");
            int userChoice = scanner.nextInt();
            
            int computerChoice = random.nextInt(3) + 1;
            
            String winner = determineWinner(userChoice, computerChoice);
            System.out.println("사용자 선택: " + userChoice);
            System.out.println("컴퓨터 선택: " + computerChoice);
            System.out.println("결과: " + winner);
            System.out.println();
            
            if (winner.equals("사용자 승리")) {
                userWins++;
            }
        }
        
        double winRate = (double) userWins / gameCount * 100;
        System.out.println("10번의 게임이 끝났습니다.");
        System.out.println("승률: " + winRate + "%");
        
        scanner.close();
    }
    
    public static String determineWinner(int userChoice, int computerChoice) {
        if (userChoice == computerChoice) {
            return "무승부";
        } else if ((userChoice == 1 && computerChoice == 3) || (userChoice == 2 && computerChoice == 1) || (userChoice == 3 && computerChoice == 2)) {
            return "사용자 승리";
        } else {
            return "컴퓨터 승리";
        }
    }
}
