package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnectivity {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//register driver (u can omit this step for mysql version 5 onwards)
	  Class.forName("com.mysql.jdbc.Driver");
	  
	  // establish the connection
	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aterbatch","root","password");
	  
	  //create statement
	  Statement stmt=con.createStatement();
	  
	  // execute query
	  ResultSet reSet=stmt.executeQuery("select * from contactdetails");
	  
	  //retrieve the result
	  while(reSet.next()) {
		  System.out.print(reSet.getInt("contact_id")+"\t");
		  System.out.print(reSet.getString("name")+"\t");
		  System.out.print(reSet.getString("contact_no")+"\t");
		  System.out.println();
	  }
	  // close connection
	  stmt.close();
	  con.close();
	}

}
