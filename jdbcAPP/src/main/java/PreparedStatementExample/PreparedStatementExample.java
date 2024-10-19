package PreparedStatementExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementExample {

	public static void main(String[] args) {
		  String url = "jdbc:mysql://localhost:3306/student_db";
	        String username = "root";
	        String password = "Durgarao@2";
	        try {
	            // Establish the connection
	            Connection con = DriverManager.getConnection(url, username, password);

	            // Create a prepared statement
	            String query = "INSERT INTO klu_students (sid,sname) VALUES (?, ?)";
	            PreparedStatement pstmt = con.prepareStatement(query);

	            // Set the parameters
	            pstmt.setInt(1,201);
	            pstmt.setString(2,"Satty");

	            // Execute the prepared statement
	            int rowsAffected = pstmt.executeUpdate();

	            System.out.println("Rows affected: " + rowsAffected);

	            // Close the resources
	            pstmt.close();
	            con.close();
	        } catch (SQLException e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	}

}
