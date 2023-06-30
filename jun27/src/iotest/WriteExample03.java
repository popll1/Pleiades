package iotest;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample03 {
	public static void main(String[] args) throws IOException {
		
		Writer writer = new FileWriter("c:/temp/write.txt");
		char[] arr = {'A','B','C','D'};
		
		writer.write(arr);
		writer.write("안녕하세요\n");
		writer.write("고생이 많네\f");
		writer.write("String 하지말고 집에갈래?");
		writer.write("엔터표시 보고 싶어?");
		writer.write("까지마");
		
		writer.flush();
		writer.close();
	}
}
