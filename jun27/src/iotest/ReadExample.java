package iotest;
//test1.db 읽어오기

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("c:/temp/test1.db");

		while (true) {
			int data = is.read();
			if (data == -1) {
				break;
			}
			System.out.println(data);
		}
	}
}
