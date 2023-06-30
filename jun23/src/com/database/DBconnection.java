package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBconnection {
	//데이터베이스 접속 정보를 저장합니다.

	public Connection getConn() {
		Connection conn =null;
		Statement stmt =null;
		ResultSet rs = null;
		
		
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			String url = "jdbc:mariadb://localhost:3306/employees";
			conn = DriverManager.getConnection(url, "root", "1413");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

}
