package com.databse.DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.database.DBconnection;
import com.database.dto.EmployeesDTO;

public class EmployeesDAO {
	//10마리 뽑기
	
	public List<EmployeesDTO> selectList() {
		List<EmployeesDTO> list = new ArrayList<EmployeesDTO>();
		//DB 접속 정보 가져오기
				DBconnection db = new DBconnection();
				Connection conn =db.getConn();
				
		//SQL 문 만들기
		String sql = "SELECT * FROM employees LIMIT 10";
		
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = conn.createStatement();
			//실행하기
			rs = stmt.executeQuery(sql);
		
	
		//while로 뽑기
		while(rs.next()) {
			//저장하기
			EmployeesDTO dto = new EmployeesDTO();
			dto.setEmp_no(rs.getInt(1));
			dto.setBirth_date(rs.getString(2));
			dto.setFirst_name(rs.getString(3));
			dto.setLast_name(rs.getString(4));
			dto.setGender(rs.getString(5));
			dto.setHire_date(rs.getString(6));
			list.add(dto);
		}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		
	
		
	}
		return list;
	}
}
