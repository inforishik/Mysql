package mysqldemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlSelect {
//program for print data
	public static void main(String[] args) throws SQLException 
	{
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
	      Statement stmt=con.createStatement();
		//String s="select * from Employeeinfo";
		String s="select sno,sname,marks from student";
		
		ResultSet rs=stmt.executeQuery(s);
		while(rs.next())
		{
			int sno=rs.getInt("SNO");
			String sname=rs.getString("SNAME");
			int marks=rs.getInt("MARKS");
			System.out.println(sno+" "+sname+" "+marks); 
		}
		con.close();

	}

}
