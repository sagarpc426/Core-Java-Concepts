package jdbc;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 


/*jar file path
 * D:\app\Deepa.Ubhe\product\12.1.0\dbhome_2\jdbc\lib
 * 
 * URL details
 * jdbc-> API
 * oracle-> Oracle database
 * thin -> driver 
 * localhost -> servername on which oracle is running/It can be IP Address
 * 1521 -> port number 
 * orcl -> servicename
 * 
 * we can find out servername & service name from tnsnames.ora file
 * 
 * path of tnsnames.ora file->
 * D:\app\Deepa.Ubhe\product\12.1.0\dbhome_2\NETWORK\ADMIN
 * 
 */

public class Demo1_Select{

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{

		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		System.out.println(" driver loaded... ");

		String url="jdbc:oracle:thin:@localhost:1521:orcl";

		Connection con = DriverManager.getConnection(url, "system","java");

		System.out.println("connected successfully .... ");
		
		Statement st=con.createStatement();

		ResultSet rs = st.executeQuery("select *  from emp");

		while(rs.next())
		{	  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
		}

		rs.close();
	
		ResultSet rs1 = st.executeQuery("select esal,ename from emp");		
		while(rs1.next())
		{	  
			//System.out.println(rs.getInt(1)+"  "+" "+rs.getString(2));
			System.out.println(rs1.getInt("esal")+"  "+" "+rs1.getString("ename"));
		}
		
		ResultSet rs2 = st.executeQuery("select empid,ename,hdate from emp2");		
		while(rs2.next())
		{	  
			System.out.println(rs2.getInt(1)+"  "+" "+rs2.getString(2)+" "+rs2.getDate(3));
			
		}
		//java.sql.Date dt = rs.getDate(2);


	}
}
