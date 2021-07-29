package jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;


public class Demo7_Properties {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException 
	{
		FileInputStream fin=new FileInputStream("info.properties");
		Properties p=new Properties(); 
		p.load(fin);
		
		String dr=p.getProperty("driver");
		
		Class.forName(dr);
		
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String uid=p.getProperty("user");
		String pwd=p.getProperty("password");
		
		Connection con= DriverManager.getConnection(url,uid,pwd);

		PreparedStatement pst=con.prepareStatement("select * from emp");
		
		
		ResultSet rs= pst.executeQuery();
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
	}
}
