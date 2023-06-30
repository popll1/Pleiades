package isHas;

public class IsHas01 {
	public static void main(String[] args) {
		      System.out.printf("%c",'C');
		      System.out.printf("%s","문자열");
		      System.out.printf("%d",33);
		      System.out.printf("%f", 3.14); // 소수점 6자리
		      System.out.printf("%.1f",3.14); //소수점 한자리만 나오게
		      System.out.printf("%b", true);
		      System.out.printf("%o", 8); //8진수
		      System.out.printf("%x", 17); //16진수
		      System.out.printf("줄바꿈%n"); // 줄바꿈 \n
		      System.out.printf("%5d",1); //5칸을 만들고 1을 출력 빈공간은 스페이스
		      System.out.printf("%05d\n",1); // 5칸을 만들고 1을 출력하되 빈자리는 0
		      System.out.println();
		      
		      System.out.printf("(%5d)",55); //(___55)
		      System.out.printf("(%-5d)",55); //(55___)      
		      
		      System.out.printf("%-10s\n","가나다라");
		      System.out.printf("%10s\n","가나다라");

	}
}
