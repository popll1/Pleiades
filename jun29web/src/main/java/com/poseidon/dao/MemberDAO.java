package com.poseidon.dao;

import java.beans.Statement;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.*;

import com.poseidon.db.DBconnection;
import com.poseidon.dto.MemberDTO;

public class MemberDAO {
	//로그인 하는 메소드
	public MemberDTO login(MemberDTO dto) {
	 MemberDTO result = new MemberDTO();
	 
	 
	 Connection conn = null;
	 conn = (Connection) DBconnection.getInstance().getConnection();

	 String sql = "SELECT* FROM member WHERE mid =" + dto.getMgrade();
	 Statement stmt = null;
	 ResultSet rs = null;
	
	 
	 result.setName("통신되었습니다.");
	return result;
	
	}

}
