package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
/*
 * 
 * 
create or replace Function addnumber(p1 number,p2 number) 
return number
IS
  psum number;
Begin
  psum:= p1+p2;
 return psum;
end;
/
 */

public class Demo6_CS_Fun {

	public static void main(String[] args)throws ClassNotFoundException, SQLException
	{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		Connection con = DriverManager.getConnection(url, "system","java");
		System.out.println("connected successfully .... ");
		
		CallableStatement stmt=con.prepareCall("{ ? = call addnumber(?,?)}");  
		stmt.registerOutParameter(1,Types.INTEGER);  
		stmt.setInt(2,30);  
		stmt.setInt(3,60);  
		stmt.execute();  
		  
		System.out.println("Sum Of Numbers = "+stmt.getInt(1)); 
		
	}
}
