package jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Demo9_DBMetaData {



	
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{


		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		Connection con = DriverManager.getConnection(url, "system","java");
		System.out.println("connected successfully .... ");

		DatabaseMetaData dm=con.getMetaData();

		System.out.println("name of the driver is:" + dm.getDriverName());
		System.out.println("name of the version  is:" + dm.getDriverVersion());
		System.out.println("Multiple Resultsets:" + dm.supportsMultipleResultSets());
		System.out.println("Multiple Transactions:" + dm.supportsMultipleTransactions());
	}
}
