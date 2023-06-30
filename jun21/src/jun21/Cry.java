package jun21;

public class Cry {

public static void main(String[] args) {
	int a= 12, b = 5, sum =2 ;
	b *= a /=4; 
	System.out.println(b); //15
	sum += ++a * b--/4;   //4* 15 / 4 ==17
	System.out.printf("%d",sum);
}	
}
