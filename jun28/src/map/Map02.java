		package map;

import java.util.LinkedHashMap;

public class Map02 {

		   public static void main(String[] args) {
		      LinkedHashMap<String, String> map02 = new LinkedHashMap<>();
		      map02.put("5번", "사과");
		      map02.put("6번", "배");
		      map02.put("1번", "포도");
		      map02.put("8번", "복숭아");
		      map02.put("7번", "망고");
		      map02.put("2번", "두리안");

		      System.out.println(map02);
		      System.out.println(map02.keySet());
		      
		   }
}