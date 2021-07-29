package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Demo4_PS_DML {
	
	public static void main(String[] args)throws ClassNotFoundException, SQLException 
	{
	
		Class.forName("oracle.jdbc.driver.OracleDriver");

		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		Connection con = DriverManager.getConnection(url, "system","java");
		System.out.println("connected successfully .... ");
		
		PreparedStatement pst= con.prepareStatement("Insert into emp values(?,?,?,?)");
		pst.setInt(1, 204);
		pst.setString(2, "Navin");
		pst.setInt(3, 55000);
		pst.setInt(4, 70);
		int p=pst.executeUpdate();		
		System.out.println(p+" row inserted ");
	

		
	/*	PreparedStatement pst1= con.prepareStatement("update emp set esal=? where empid=?");
		pst1.setInt(1, 40000);
		pst1.setInt(2, 106);
		int k=pst1.executeUpdate();
		System.out.println(k+" row updated ");
		
		
		
		PreparedStatement pst2= con.prepareStatement("delete from emp where empid>?");		
		pst2.setInt(1, 201);					
		int b=pst2.executeUpdate();
		System.out.println(b+" row deleted ");*/
	}

}
