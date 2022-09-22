package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementEx {
	Connection con;
	Statement stmt;
	ResultSet resultSet;
	
	public StatementEx() throws ClassNotFoundException, SQLException {
		con=MyConnection.getMyConnection();
		System.out.println("connection get open");
	}

	public void getData() throws SQLException {
		stmt=con.createStatement();
		resultSet=stmt.executeQuery("select * from contactdetails");
		while(resultSet.next()) {
			System.out.print(resultSet.getInt(1)+"\t");
			System.out.print(resultSet.getString(2)+"\t");
			System.out.print(resultSet.getString(3)+"\t");
			System.out.println();
		}
		stmt.close();
		con.close();
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		StatementEx st=new StatementEx();
		st.getData();

	}

}
