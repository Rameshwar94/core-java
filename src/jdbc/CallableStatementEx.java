package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.CallableStatement;

public class CallableStatementEx {
	Connection con;
	CallableStatement callStmt;
	
	public CallableStatementEx() throws ClassNotFoundException, SQLException {
		con=MyConnection.getMyConnection();
		System.out.println("connection get open");
	}
	
	public void callingPrcedure(int id,String name) throws SQLException {
		callStmt=con.prepareCall("{call insert_record(?,?) }");
		callStmt.setInt(1, id);
		callStmt.setString(2,name);
		callStmt.execute();
		System.out.println("record is inserted");
	} 

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		CallableStatementEx cs=new CallableStatementEx();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id and name to insert:");
		int id=sc.hashCode();
		sc.nextLine();
		String name=sc.nextLine();
		cs.callingPrcedure(id, name);
		

	}

}
