package cat;

import java.util.Scanner;



class Cat {
   public int run() {
      // 1~5무작위 숫자
      return (int) (Math.random() * 5) + 1;
   }
   
   public int run(int roomNumber) {
      // 인접 숫자로 이동 1 == 2, 5 == 4
      int result;
      if(roomNumber == 1) {
         result = 2;
      }else if(roomNumber == 5) {
         result = 4;
      } else {
         if((int)(Math.random() * 2) == 1) {
            result = roomNumber + 1;
         } else {
            result = roomNumber - 1;
         }
      }
      return result;
   }
}

public class MS {
   public static void main(String[] args) {
      Cat cat = new Cat();
      int position = cat.run();
      //System.out.println(position);
      //position = cat.run(position);
      //System.out.println(position);
      Scanner sc = new Scanner(System.in);
      while (true) {
         System.out.print("상자 번호 입력 : ");
         int input = sc.nextInt();
         if(position == input) {
            System.out.println("잡았습니다.");
            break;
         } else {
            position = cat.run(position);
         }
         System.out.println("하루가 지났습니다.");
      }
      sc.close();
      
      
   }
   

}

		