package com.databridge;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeDAO {
	
//	INSERT
	public void addEmployee(Employee emp) {
		String query = "INSERT INTO employee VALUES (?, ?, ?)";
		
		try(Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(query))
		{
			ps.setInt(1, emp.getId());
			ps.setString(2, emp.getName());
			ps.setDouble(3, emp.getSalary());
			
			ps.executeUpdate();
			System.out.println("Employee Added");
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
//	SELECT
	public void getAllEmployee() {
		String query = "SELECT * from employee";
		
		try(Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery()){
			
			while(rs.next()) {
				System.out.println(
						rs.getInt("Id") + " " +
						rs.getString("name") + " " +
						rs.getDouble("salary") 
						);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
//	UPDATE
	public void updateEmployee(int id , String name, double salary) {
		String query = "UPDATE employee SET name=?, salary=? WHERE id=?";
		
		try(Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(query)){
		
			ps.setString(1, name);
			ps.setDouble(2, salary);
			ps.setInt(3, id);
		
		
		ps.executeUpdate();
		System.out.println("Employee Added");
	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
//	DELETE
	public void deleteEmployee(int id) {
		String query = "DELETE FROM employee WHERE id=?";
		
		try(Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(query))
		{
			ps.setInt(1, id);
			ps.executeUpdate();
			
			System.out.println("Employee Deleted");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	

}
