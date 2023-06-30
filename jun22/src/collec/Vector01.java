package collec;

import java.util.Vector;

//DTO 파일 전송 객체(Data Transfer Object)
class BoardDTO{
	int bNo;
	String bTitle;
	String bWriter;
	int bRead;
	String bDate;
	
	public BoardDTO(int bNo, String bTitle, String bWriter, int BRead, String bDate) {
		
		this.bNo = bNo;
		this.bTitle = bTitle;
		this.bWriter = bWriter;
		this.bRead = bRead;
		this.bDate = bDate;
		
	}
	
	
}



public class Vector01 {
	public static void main(String[] args) {
		
		Vector<BoardDTO> board = new Vector<BoardDTO>();
		board.add(new BoardDTO(10, "열번째 글", "홍길동", 80, "2023-06-22"));
		board.add(new BoardDTO(10, "아홉번째 글", "홍길동", 80, "2023-06-22"));
		board.add(new BoardDTO(10, "여덟번째 글", "이길동", 80, "2023-06-22"));
		board.add(new BoardDTO(10, "일곱번째 글", "임길동", 80, "2023-06-21"));
		board.add(new BoardDTO(10, "여섯 번째 글", "정나래", 80, "2023-06-21"));
		board.add(new BoardDTO(10, "다섯번째 글", "홍길동", 80, "2023-06-20"));
		board.add(new BoardDTO(10, "넷번째 글", "정수희", 80, "2023-06-20"));
		board.add(new BoardDTO(10, "셋번쨰 글", "곽길동", 80, "2023-06-20"));
		board.add(new BoardDTO(10, "둘번째 글", "차길동", 80, "2023-06-19"));
		board.add(new BoardDTO(10, "하나번째 글", "이길동", 80, "2023-06-19"));
		
		
		
		
		System.out.println("===============================================================");
	      System.out.println("번호 \t 제목 \t\t 글쓴이 \t 조회수 \t 날짜");
	      System.out.println("---------------------------------------------------------------");
	      for (int i = 0; i < board.size(); i++) {
	         System.out.printf("%d \t %s \t %s \t %d \t %s\n",
	               board.get(i).bNo,
	               board.get(i).bTitle,
	               board.get(i).bWriter,
	               board.get(i).bRead,
	               board.get(i).bDate);
	      }
	}
}
