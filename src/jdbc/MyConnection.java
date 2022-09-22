package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	static Connection con;
	
	public static Connection getMyConnection() throws ClassNotFoundException, SQLException {
		if(con==null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aterbatch","root","password");
			System.out.println("connected to database ....... \n");
			return con;
		}
		else {
			System.out.println("connected to database ....... \n");
			return con;
		}
	}
	public static Connection getMyNewConnection() throws ClassNotFoundException, SQLException {
		if(con==null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_mnagement_system","root","password");
			System.out.println("connected to database ....... \n");
			return con;
		}
		else {
			System.out.println("connected to database ....... \n");
			return con;
		}
	}
}
