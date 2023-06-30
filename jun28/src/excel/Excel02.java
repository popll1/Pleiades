package excel;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

/*
 * apache POI의 주요 클래스들은 주로 HSSP, XFFP 로 시작한다. 차이점은 아래와 같다.
 * 
 * - HSSP
 * 		Excel 97(-2007) 파일 포맷을 사용할 때 사용
 * 		ex) HSSPWorkbook, HSSFSfeet
 * 
 * - XSSF
 * 		Excel 2007 OOXML (*xlsx ) 파일 포맷을 사용할 때 사용
 * 		ex ) XSSFWorkbook, XSSFSheer
 * 
 * 2. Workbook, Sheet, Row, Cell
 * 
 * 		Workbook 은 하나의 액셀 파일을 의미
 * 		sheet 는 액셀파일 ( =workbook)의 시트를 의미
 * 		Row, cell 은 Sheet 안에 있는 행과 열을 의미
 * 
 * 		
 * 
 */


public class Excel02 {
	public static String filepath = "c:/temp";
	public static String fileNm = "excel02.xls";
	
	
	public static void main(String[] args) {
		//빈 Workbook 생성
		HSSFWorkbook workbook = new HSSFWorkbook();
		//빈 Sheet를 생성
		HSSFSheet sheet = workbook.createSheet("징거버거");
	
		// sheet를 채우기 위한 데이터를 Map에 저장
		Map<String, Object[]> data = new TreeMap<String, Object[]>();
		data.put("1", new Object[] { "ID" , "Name",  "전화번호"});
		data.put("2", new Object[] { "1" , "쿠키",  "010-1111-2222"});
		data.put("3", new Object[] { "2" , "식빵",  "010-2222-3333"});
		data.put("4", new Object[] { "3" , "마카롱",  "010-3333-4444"});
		data.put("5", new Object[] { "4" , "오레오",  "010-4444-5555"});
		
		//data에서 keySet을 가져옵니다. 이 set값들을 조회해서 sheet에 입력
		Set<String> keySet = data.keySet();
		int rownum = 0;
		
		for (String key : keySet) {
			Row row = sheet.createRow(rownum++);
			Object[] objArr = data.get(key);
			int cellnum = 0;
			for (Object obj : keySet) {
				Cell cell = row.createCell(cellnum++);
				if(obj instanceof String) { 
					cell.setCellValue((String)obj);
				
				}else if(obj instanceof Integer) { 
					cell.setCellValue((String)obj);
					
				}
				
			}
		}
		 
		try {
			FileOutputStream out = 
					new FileOutputStream(new File(filepath, fileNm));
			workbook.write(out);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	
	}

}