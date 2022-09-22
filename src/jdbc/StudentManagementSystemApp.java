package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class StudentManagementSystemApp {
	Connection con;
	PreparedStatement preparedStatement;
	CallableStatement callableStatement;
	ResultSet resultSet;
    static int choice;

	public StudentManagementSystemApp() throws ClassNotFoundException, SQLException {
		con = MyConnection.getMyNewConnection();
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException, ParseException {
		
		StudentManagementSystemApp studentManagementSystem=new StudentManagementSystemApp();
		
		System.out.println("\t*****welcome to Student Management System!!*****\t\n ");
		String s;
		do {
		System.out.println("what you want to do(Enter Option no): \n \t1.Add Student \n "
				+ "\t2.View All Student Details \n \t3.Get student Details by City"
				+ "\n \t4.Update Student By Roll No \n \t5.Delete Student By Roll No \n "
				+ "\t6.show student between percentage range \n \t7.Check who is Topper? \n \t8.Get Student By Roll No");

		Scanner sc = new Scanner(System.in);
		 choice = sc.nextInt();
		switch (choice) {
		case 1:
			studentManagementSystem.insertStudentDetails();
			break;
		
		case 2:
			studentManagementSystem.getStudentDetails();
			break;
			
		case 3:
			sc.nextLine();
			System.out.println("Enter City:");
			String city=sc.nextLine();
			studentManagementSystem.getStudentByCity(city);
			break;
			
		case 4:
			studentManagementSystem.insertStudentDetails();
			break;
			
		case 5:
			System.out.println("Enter rollno to delete Student:");
			int rollno=sc.nextInt();
			studentManagementSystem.deleteStudentbyrollno(rollno);
			break;
			
		case 6:
			System.out.println("Enter Min and Max percentage:");
			int min=sc.nextInt();
			int max=sc.nextInt();
			studentManagementSystem.showStudentByPercentage(min, max);
			break;
			
		case 7:
			System.out.println("topper is:");
			studentManagementSystem.showTopper();
			break;
			
		case 8:
			System.out.println("Enter roll no:");
			int rn=sc.nextInt();
			studentManagementSystem.getStudentByRollNo(rn);
			break;
			
		default:
			System.out.println("Invalid choice,please enter the valid option number");
		}
		System.out.println("Do you want to continue(Y/N)");
		//sc.nextLine();
		 s=sc.nextLine();
		}while(s.equalsIgnoreCase("y"));
	}

	public void addStudent(int rollNo, String name,Date dob, float percentage, String emailId, String phoneNo,
			String address) throws SQLException {
		callableStatement = con.prepareCall("{call insertStudentRecord(?,?,?,?,?,?,?)}");
		callableStatement.setInt(1, rollNo);
		callableStatement.setString(2, name);
		callableStatement.setObject(3, dob);
		callableStatement.setFloat(4, percentage);
		callableStatement.setString(5, emailId);
		callableStatement.setString(6, phoneNo);
		callableStatement.setString(7, address);
		boolean b = callableStatement.execute();
		System.out.println(b + "  record is inserted");
	}

	public void getStudentDetails() throws SQLException {
		preparedStatement = con.prepareStatement("select * from student");
		resultSet = preparedStatement.executeQuery();
		getRecords(resultSet);
	}

	public void getStudentByCity(String city) throws SQLException {
		preparedStatement = con.prepareStatement("select * from student where address=?");
		preparedStatement.setString(1, city);
		resultSet = preparedStatement.executeQuery();
		getRecords(resultSet);
	}

	public void updateStudentByRollNo(int rollNo, String name,Date dob, float percentage, String emailId,
			String phoneNo, String address) throws SQLException {
		preparedStatement = con.prepareStatement(
				"update student set student_name=?,dob=?,percentage=?,email_id=?,phone_no=?,address=? where rollno=?");
		preparedStatement.setString(1, name);
		preparedStatement.setObject(2, dob);
		preparedStatement.setFloat(3, percentage);
		preparedStatement.setString(4, emailId);
		preparedStatement.setString(5, phoneNo);
		preparedStatement.setString(6, address);
		preparedStatement.setInt(7, rollNo);
		int n = preparedStatement.executeUpdate();
		System.out.println(n + "updated successfully");
	}

	public void deleteStudentbyrollno(int rollNo) throws SQLException {
		preparedStatement = con.prepareStatement("delete from student where rollno=?");
		preparedStatement.setInt(1, rollNo);
		int n = preparedStatement.executeUpdate();
		System.out.println(n + "student deleted successully");
	}

	public void showStudentByPercentage(float min, float max) throws SQLException {
		preparedStatement = con.prepareStatement("select * from student where percentage between ? and ?");
		preparedStatement.setFloat(1, min);
		preparedStatement.setFloat(2, max);
		resultSet = preparedStatement.executeQuery();
		getRecords(resultSet);
	}

	public void showTopper() throws SQLException {
		preparedStatement = con.prepareStatement("select * from student where percentage=(select max(percentage) from student)");
		resultSet = preparedStatement.executeQuery();
		getRecords(resultSet);
	}

	public void getStudentByRollNo(int rollNo) throws SQLException {
		preparedStatement = con.prepareStatement("select * from student where rollno=?");
		preparedStatement.setInt(1, rollNo);
		resultSet = preparedStatement.executeQuery();
		getRecords(resultSet);
	}

	public void getRecords(ResultSet resultSet) throws SQLException {
		while (resultSet.next()) {
			System.out.print(resultSet.getInt(1) + "\t");
			System.out.print(resultSet.getString(2) + "\t\t");
			System.out.print(resultSet.getObject(3) + "\t");
			System.out.print(resultSet.getFloat(4) + "\t");
			System.out.print(resultSet.getString(5) + "\t\t");
			System.out.print(resultSet.getString(6) + "\t\t");
			System.out.print(resultSet.getString(7) + "\n");
		
		}
	}

	public void insertStudentDetails() throws SQLException, ParseException {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Student details: \n Enter Roll no:");
		int rollNo=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name:");
		String name=sc.nextLine();
		System.out.println("Date of Birth(dd-mm-yyyy):");
		String date=sc.nextLine();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
	     Date dob = (Date) formatter.parse(date);
		System.out.println("Enter percentage:");
		float percent=sc.nextFloat();
		sc.nextLine();
		System.out.println("Enter Email-id:");
		String email=sc.nextLine();
		System.out.println("Enter phone no:");
		String phone=sc.nextLine();
		System.out.println("Enter Address:");
		String address=sc.nextLine();
		if(choice==1) 
		addStudent(rollNo, name, dob, percent, email, phone, address);
		
		else{
			updateStudentByRollNo(rollNo, name, dob, percent, email, phone, address);
		}
		
	}
}
