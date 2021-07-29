package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Demo2_DML {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{


		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		Connection con = DriverManager.getConnection(url, "system","java");
		System.out.println("connected successfully .... ");
		
		Statement st= con.createStatement();
		
	/*	int n=st.executeUpdate("Insert into Emp values(201,'Kimaya',54000,60)");
		System.out.println(n+" row inserted ");
		*/
		
	/*	int p=st.executeUpdate("Update Emp set esal=esal-6000 where empid=108");
		System.out.println(p+" row updated  ");
		*/
	
	    int k=st.executeUpdate("Delete from  emp where empid>200");
		System.out.println(k+" rows deleted  ");
	}

}
