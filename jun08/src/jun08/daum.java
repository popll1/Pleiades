package jun08;

/*1차원의 점들이 주어졌을 때, 그 중 가장 거리가 짧은 것의 쌍을 출력하는 함수를 작성하시오. 
 * (단 점들의 배열은 모두 정렬되어있다고 가정한다.)
예를들어 S={1, 3, 4, 8, 13, 17, 20} 이 주어졌다면, 결과값은 (3, 4)가 될 것이다*/
public class daum {
	public static void main(String[] args) {
		int[] map = new int[] { 1, 3, 4, 8, 13, 17, 20 };
		int fir = 1; // 시작숫자
		int sec = 3; // 끝숫자
		int temp = map[1] - map[0];// 두 수의 차이

		for (int i = 0; i < map.length - 1; i++) {
			// System.out.print(map[i] +", "+ map[i + 1 ] + " : ");
			// System.out.println("");
			// System.out.println(map[ i + 1] - map[i]);
			// i + 1까지 가게 하려고
			if (map[i + 1] - map[i] < temp) {
				temp = map[i + 1] - map[i];
				fir = map[i];
				sec = map[i + 1];

			}
		}
		System.out.println("두 거리의 차가 가작 작은 숫자는");
		System.out.println(fir + ", " + sec);
//알고리즘, 자료구조
		{

		}

	}

}
