package file;
//P.640
import java.io.FileWriter;
import java.io.IOException;

public class File02 {
	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("c:/temp/fileWriter.txt",true);
			for (int i = 0; i < 10; i++) {
				String data = i +  "번째 이서서 씁니다.\n";
				fw.write(data);
				
				
			}
			fw.flush();
			fw.close();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
