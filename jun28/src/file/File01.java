package file;

import java.io.*;

public class File01 {
	public static void main(String[] args) {
		
		FileWriter fw;
		try {
			fw = new FileWriter("c:/temp/fileWriter.txt");
			for (int i = 0; i < 10; i++) {
				String data = i + "번째 글을 씁니다\n";
				fw.write(data);
			}
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
					
		
	}
}
