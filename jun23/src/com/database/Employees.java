package com.database;

import java.util.List;

import com.database.dto.EmployeesDTO;
import com.databse.DAO.EmployeesDAO;



public class Employees {
	public static void main(String[] args) {
		EmployeesDAO dao = new EmployeesDAO();
		List<EmployeesDTO> list = dao.selectList();
		System.out.println("번호\t생년월일\t이름\t\t성\t   성별\t입사일");
		System.out.println("----------------------------------------------------------------------");
		for (EmployeesDTO employee : list) {
				System.out.printf("%3d   ", employee.getEmp_no());
				System.out.printf("%10s  ", employee.getBirth_date());
			System.out.printf("%-15s  ", employee.getFirst_name());
			System.out.printf("%-15s  ", employee.getLast_name());
			System.out.printf("%2s  ", employee.getGender());
			System.out.printf("%10s\n", employee.getHire_date());
		}
		System.out.println("----------------------------------------------------------------------");
		
	}
}
