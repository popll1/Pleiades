package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exception05 {
	public static void main(String[] args) {
		int[] arr01 = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		try {
			System.out.println(arr01[arr01.length] - 5);
			System.out.println("여기는 볼수 없다");

			System.out.println(10 / 0);

			try {
				System.out.println(10 / 0);
			} catch (ArithmeticException e) {
				System.out.println("0으로 나누면 안 됩니다.");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 길이 밖으로....");
		} finally {
			System.out.println("예외 발생 유무와 상관없이 실행");
		}

		//// 파일 없음 오류
		Scanner sc = new Scanner(System.in);
		System.out.println("c:/temp/temp.txt 라고 입력하세요");

		String file = sc.next();
		try {
			FileReader fr = new FileReader(file);
			System.out.println("파일 있음.");
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일 없음.");
		} finally {
			//마지막에 오픈한 객체부터 닫아주세요.
			sc.close();
		}
	}

}
