package jun13;

import java.util.Iterator;

public class TestMySelf01 {
	public static void main(String[] args) {

		int cnt = 0;

		for (int i = 1; i < 10000; i++) {
			if (i % 10 == 8)
				cnt++;
			if ((i / 10) % 10 == 8)
				cnt++;
			if ((i / 100) % 10 == 8)
				cnt++;
			if ((i / 1000) % 10 == 8)
				cnt++;
		}

		System.out.println("result : " + cnt);
	}

}
