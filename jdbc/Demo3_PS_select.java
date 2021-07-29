package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Demo3_PS_select {
	
	public static void main(String[] args)throws ClassNotFoundException, SQLException 
	{
	
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		Connection con = DriverManager.getConnection(url, "system","java");
		System.out.println("connected successfully .... ");
		
		
		PreparedStatement pst= con.prepareStatement("select * from emp where esal>?");
		
		pst.setInt(1, 50000);
		
		ResultSet  rs=pst.executeQuery();
		
		while(rs.next())
		{	  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
		}
		System.out.println("----------------------------------------------------------------");
		
		pst.clearParameters();
		
		pst.setInt(1,10000);
		
		rs=pst.executeQuery();
		
		while(rs.next())
		{	  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
		}
		
		
	}
}
