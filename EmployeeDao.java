package emp.registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import emp.registration.model.Employee;

public class EmployeeDao {

	public int registerEmployee(Employee employee) throws ClassNotFoundException {
		
		Connection conn=null;
		PreparedStatement prst=null;
		
		int result=0;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "aditya");
			
			String query="insert into emp(id,first_name,last_name,username,pass,address,contact) values(?,?,?,?,?,?,?)";
			
			prst=conn.prepareStatement(query);
			
			prst.setInt(1, 1);
			prst.setString(2, employee.getFirstname());
			prst.setString(3, employee.getLastname());
			prst.setString(4, employee.getUsername());
			prst.setString(5, employee.getPassword());
			prst.setString(6, employee.getAddress());
			prst.setString(7, employee.getContact());
			
			System.out.println(prst);
			result=prst.executeUpdate();
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return result;

	}

}
