package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
  create or replace procedure updatesalary(pid number,psalary number)
Is
Begin
    update emp set esal=psalary where empid=pid;
 end;
/
 
 */
public class Demo5_CS_Proc {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
	
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		Connection con = DriverManager.getConnection(url, "system","java");
		System.out.println("connected successfully .... ");
		CallableStatement stmt=con.prepareCall("{call updatesalary(?,?)}");  
		stmt.setInt(1,109);  
		stmt.setInt(2,45000); 		 
		stmt.execute();  
		System.out.println("Done ");
		  
	}

}
