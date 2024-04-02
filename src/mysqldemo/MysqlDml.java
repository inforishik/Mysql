package mysqldemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
  //program for insert data
public class MysqlDml {

	public static void main(String[] args) throws SQLException
	{
     Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
      Statement stmt=con.createStatement();
      
   //  String s="INSERT INTO STUDENT VALUES(102,'MICHEL')";
     // String s1="UPDATE STUDENT SET SNAME='DAVID' WHERE SID=102";
      String s2="DELETE FROM STUDENT WHERE SID=102";
      //stmt.execute(s1);
      //stmt.execute(s);
    stmt.execute(s2);
    con.close();
      System.out.println("Query Executed..");
	}

}
