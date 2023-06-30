package Calc;

import java.util.Arrays;

public class Calc {
   // 필드
   // 생성자
   // 메소드

   int plus(int num1, int num2) {
      System.out.println("출력문 : 계산을 시작합니다");
      return num1 + num2;
   }

   public static void main(String[] args) {
      Calc calc ; 
      calc = new Calc();
      //    Calc calc = new Calc();와 같이 한문장으로 표현가능하다. 

      String name = "가나다라마";
      int result = calc.plus(15, name.length());
      System.out.println(result);

      Lotto lotto = new Lotto();
      lotto.choose();//중복제거
      lotto.sort();//정렬
      lotto.print();
   }

}// 클래스 밖

class Lotto {
   int[] lottoNum = new int[6];
   // 로또 번호 뽑는 메소드
   public int[] choose() {
      // 번호 뽑는 작업은 여기서...
      for (int i = 0; i < lottoNum.length; i++) {
         int temp = (int) (Math.random() * 45) + 1;
//         System.out.println(temp);
         boolean ch = true;
         
         
         for (int j = 0; j < i+1; j++) {
            if(temp == lottoNum[j]) {
               ch = false;//중복되면 거짓
               break;
            }
         }
         
         if(ch) {
            lottoNum[i] = temp;//참이면 등록
         } else {
            i--;//다시 실행
         }
      }
      return lottoNum;
   }

   public void sort() {
     Arrays.sort(lottoNum);
   }

   public void print() {
      for (int i = 0; i < lottoNum.length; i++) {
         System.out.print(lottoNum[i]);
         
         if (lottoNum[i] == lottoNum[lottoNum.length - 1]) {
        	 System.out.print(" ");

         } else {
        	 System.out.print(", ");
        	 
        	 
			
	

		}
     }
   }
   
}