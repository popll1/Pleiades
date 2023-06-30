package dbconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DB02 {
	public static void main(String[] args) {
		final String URL = "jdbc:mariadb://localhost:3306/employees";
		final String ID = "root" ;
		final String PW = "1413";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Employee> member = new ArrayList<Employee>();
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			try {
				conn = DriverManager.getConnection(URL, ID, PW);
				stmt = conn.createStatement();
				String sql = "SELECT * FROM employees LIMIT 10";
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) { 
					Employee e = new Employee();
					
					e.setEmp_no(rs.getInt("emp_no"));
					e.setBirth_date(rs.getString("birth_date"));
					e.setFirst_name(rs.getString("first_name"));
					e.setLast_name(rs.getString("last_name"));
					e.setGender(rs.getString("gender").charAt(0));
					e.setHire_date(rs.getString("hire_date"));
					member.add(e);
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally { //마지막에 연 것 부터 닫습니다. rs ->stmt ->conn
			try {
				rs.close();
				stmt.close();
				conn.close();
							
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	      System.out.println("번호\t생년월일\t     이름\t\t\t성\t      성별   입사일");
	      System.out.println("----------------------------------------------------------------------");
//	       
	      for (Employee employee : member) {
	         System.out.printf("%3d   ", employee.getEmp_no());
	         System.out.printf("%10s  ", employee.getBirth_date());
	         System.out.printf("%-15s  ", employee.getFirst_name());
	         System.out.printf("%-15s  ", employee.getLast_name());
	         System.out.printf("%2c  ", employee.getGender());
	         System.out.printf("%10s\n", employee.getHire_date());
	      }
	      System.out.println("----------------------------------------------------------------------");
	      	      

			
		}
	}
	
/*
 * DTO(Data Transfer Object) - > EmployeeDTO ( 데이터 전송 객체)
 * 
 * VO (Value object)- >  값 객체
 * DAO(Data Access Object) - > SQL
 * Connection -> DB접속정보 ->  싱글턴 패턴
 * 
 * 
 * 
 * 
 * 
 * 
 */
		


