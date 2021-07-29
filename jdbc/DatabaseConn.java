package jdbc;

import java.sql.*;

public class DatabaseConn {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver loaded");
		String url = "jdbc:oracle:thin:@DESKTOP-OPGU78J:1521:XE";
		Connection con = DriverManager.getConnection(url,"scott","tiger");
		System.out.println("Connected");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select ename from emp where empno = 7369");
		while(rs.next()) {
			System.out.println("Using statement : "+rs.getString(1));
		}
		rs.close();
		// Prepared Statement
		PreparedStatement pt = con.prepareStatement("select * from emp");
		rs = pt.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
		rs.close();
	}

}
