package com.databridge;

import java.sql.Connection;
import java.sql.DriverManager;

public class MainApp {
	
	public static void main(String[] args) {
	
		EmployeeDAO dao = new EmployeeDAO();
		
//		INSERT
		dao.addEmployee(new Employee(1,"Anjali", 85000));
		dao.addEmployee(new Employee(2,"Boyce", 20000));
		dao.addEmployee(new Employee(3,"Chlyce", 35000));
		dao.addEmployee(new Employee(4,"Doermon", 95000));
		dao.addEmployee(new Employee(5,"Elite" , 45678));
		
//		FETCH
		dao.getAllEmployee();
		
//		UPDATE
		dao.updateEmployee(1,"Ash", 90000);
		
//		DELETE
//		dao.deleteEmployee(1);
	}

}
