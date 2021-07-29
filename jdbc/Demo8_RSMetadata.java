package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


public class Demo8_RSMetadata {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{


		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		Connection con = DriverManager.getConnection(url, "system","java");
		System.out.println("connected successfully .... ");
		Statement st=con.createStatement();

		ResultSet rs = st.executeQuery("select * from emp");
		
		ResultSetMetaData rmd= rs.getMetaData();
		
		System.out.println("Column count = "+rmd.getColumnCount());
		
		
		System.out.println("Column name = "+rmd.getColumnName(1));
		System.out.println("Column name = "+rmd.getColumnName(2));
		System.out.println("Column name = "+rmd.getColumnName(3));
		System.out.println("Column name = "+rmd.getColumnName(4));
		
		System.out.println("Column DisplaySize = "+rmd.getColumnDisplaySize(1));
		System.out.println("Column DisplaySize = "+rmd.getColumnDisplaySize(2));
		System.out.println("Column DisplaySize = "+rmd.getColumnDisplaySize(3));
		System.out.println("Column DisplaySize = "+rmd.getColumnDisplaySize(4));
		
		
	}
}
