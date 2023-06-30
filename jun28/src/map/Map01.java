package map;

import java.util.TreeMap;

public class Map01 {
	public static void main(String[] args) {
		//treeMap : 이진트리를 기반으로 한 map
		TreeMap<Integer, String> map1 = new TreeMap<Integer, String>();
		map1.put(6, "");
		map1.put(3, "JMT");
		map1.put(7, "Spring");
		map1.put(8, "SQL");
		map1.put(1, "andinid");
		map1.put(9, "swift");
		map1.put(5, "Puthon");
	
	System.out.println(map1);
	System.out.println(map1.keySet());
	System.out.println(map1.values());
	
	}
	}
