package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.entity.ContactDetails;

public class JdbcInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		List<ContactDetails> contactDetails = new ArrayList<ContactDetails>();
		contactDetails.add(new ContactDetails(102, "Abc", 123243));
		contactDetails.add(new ContactDetails(103, "sdf", 123243));
		contactDetails.add(new ContactDetails(104, "ghngh", 123243));
		contactDetails.add(new ContactDetails(105, "dfgd", 123243));
		contactDetails.add(new ContactDetails(106, "vbdf", 123243));

		Class.forName("com.mysql.jdbc.Driver");

		// establish the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aterbatch", "root", "password");

		// create statement
		Statement stmt = con.createStatement();

		for (ContactDetails contactDetails2 : contactDetails) {
			String query = "insert into contactdetails values(" + contactDetails2.getContactId() + ", '"
					+ contactDetails2.getName() + "', " + contactDetails2.getContactNo() + ")";
			 stmt.execute(query);

			StringBuilder builder = new StringBuilder("insert into contactdetails values(");
			builder.append(contactDetails2.getContactId()).append(", '").append(contactDetails2.getName()).append("', ")
					.append(contactDetails2.getContactNo()).append(")");
			// stmt.execute(builder.toString());
		}

		// execute query
		ResultSet reSet = stmt.executeQuery("select * from contactdetails");

		// retrieve the result
		while (reSet.next()) {
			System.out.print(reSet.getInt("contact_id") + "\t");
			System.out.print(reSet.getString("name") + "\t");
			System.out.print(reSet.getString("contact_no") + "\t");
			System.out.println();
		}
		// close connection
		stmt.close();
		con.close();

	}

}
