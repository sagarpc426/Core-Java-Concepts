package jdbc;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.Caret;


public class Demo10_QueryAnalyzer extends JFrame{

	JTextField jt;
	JButton bt;
	JTextArea jarea;
	public Demo10_QueryAnalyzer()
	{
		this.setLayout(new FlowLayout());
		jt=new JTextField(20);
		jarea=new JTextArea(20,20);
		bt=new JButton("Execute");

		this.add(jt);
		this.add(bt);
		this.add(jarea);		

		this.setVisible(true);
		this.setSize(400, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);



		bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Connection con;
				Statement stmt;	
				try
				{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					String url="jdbc:oracle:thin:@localhost:1521:orcl";	
					con= DriverManager.getConnection(url,"system","java");	
					//System.out.println("\n Connection Established");

					stmt=con.createStatement();

					boolean status =stmt.execute(jt.getText());


					if(status)
					{

						ResultSet rs=stmt.getResultSet();	
						while(rs.next())
						{
							jarea.setText(jarea.getText()+"\n"+rs.getInt(1)+ " "+rs.getString(2));
						}	
					}

					else
					{
						int n=stmt.getUpdateCount();
						jarea.setText("");
						jarea.setText(n+ "rows affected ");			
					}

				}
				catch(Exception e1)
				{
					System.out.println(e1.getMessage());
				}
			}
		});


	}


	public static void main(String[] args) {


		new Demo10_QueryAnalyzer();
	}
}

