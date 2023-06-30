package com.poseidon.db;
//이제 전설의 싱글턴을...

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
	//싱글턴화
	
	private static DBconnection instance = new DBconnection();
	//생성자 숨김
	private DBconnection() {
		//딱 하나 만들어진 인스턴스 호출메소드
	}
	public static DBconnection getInstance() { 

			return instance;
		
		}
		
		
		
	
	public ConnectException getConnection() {
		Connection conn = null;
		
		try {
			Class.forName("");
			String url = "jdbc:mariadb://localhost:3306/choongang" ;
			conn = DriverManager.getConnection(url, "andy", "0504");
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return null;
		
		
	}

}
