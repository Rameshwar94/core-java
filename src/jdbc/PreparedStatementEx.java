package jdbc;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class PreparedStatementEx {
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public PreparedStatementEx() throws ClassNotFoundException, SQLException {
		con=MyConnection.getMyConnection();
		//System.out.println("connection get open");
	}

	//get data from employee table
	public void getData(int minId,int maxId) throws SQLException {
		pstmt=con.prepareStatement("select * from customer where cust_id between ? and ?");
		pstmt.setFloat(1, minId);
		pstmt.setFloat(2, maxId);
		rs=pstmt.executeQuery();//DRL
		while(rs.next()) {
			System.out.print(rs.getInt(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.print(rs.getString(3)+"\t");
			System.out.print(rs.getString(4)+"\t");
			System.out.println();
		}
		
	}
	//insert data into student table
	public void insertRecord(int studentId,String name,Date date,String city,float percentage) throws SQLException {
		pstmt=con.prepareStatement("insert into student values(?,?,?,?,?)");
		pstmt.setInt(1, studentId);
		pstmt.setString(2, name);
		pstmt.setObject(3, date);
		pstmt.setString(4,city);
		pstmt.setFloat(5, percentage);
		int n=pstmt.executeUpdate();//DML
		System.out.println(n+"record is inseted");
	}
	
	public void updateRecord(int studentId,String name) throws SQLException {
		pstmt=con.prepareStatement("update student set name=? where student_id=?");
		pstmt.setString(1, name);
		pstmt.setInt(2, studentId);
		//pstmt.setString(4,city);
		//pstmt.setFloat(5, percentage);
		int n=pstmt.executeUpdate();//DML
		System.out.println(n+"record is updated");
	}
	
	public void deleteRecord(int custId) throws SQLException {
		pstmt=con.prepareStatement("delete from customer where cust_id=?");
		pstmt.setInt(1, custId);
		int n=pstmt.executeUpdate();
		System.out.println(n+"record is deleted");
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException, ParseException {
		PreparedStatementEx ps=new PreparedStatementEx();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter min and max id range:");
		int min=sc.nextInt();
		int max=sc.nextInt();
		ps.getData(min, max);
		System.out.print("Enter Student details in sequence:"+"/t"+"1.id"+"/t"+"2.name"+"/t"+"3.dob(dd-MM-yyyy)"+"/t"+"4.city"+"/t"+"5.percentage");
		int id=sc.nextInt();
		sc.nextLine();
		String name=sc.nextLine();
		String dob=sc.nextLine();
		//following command also work just change type of date to LocalDate while declaring the parameters in insertRecord method
	//	LocalDate date=LocalDate.parse(dob); 
		
	
	      SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
	     
	      Date date = (Date) formatter.parse(dob);
		
		String city=sc.nextLine();
		Float percent=sc.nextFloat();
		ps.insertRecord(id, name, date, city, id);
		System.out.println("enter id and name:");
		int id1=sc.nextInt();
		sc.nextLine();
		String name1=sc.nextLine();
		ps.updateRecord(id1, name1);
		
		System.out.println("enter cust_id to delete a record:");
		int cId=sc.nextInt();
		ps.deleteRecord(cId);

	}

}
