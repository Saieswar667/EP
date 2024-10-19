package s13.jdbcAPP;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class App3update {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/student_db";
        String username = "root";
        String password = "Durgarao@2";

        try {
            // Establish the connection
            Connection con = DriverManager.getConnection(url, username, password);

            // Insert a new record
           
            PreparedStatement pstmt ;

            

            // Update the record
            String updateQuery = "UPDATE klu_students SET sname = ? WHERE sid = 200";
            pstmt = con.prepareStatement(updateQuery);

            // Set the parameters for update
            pstmt.setString(1, "Johnny"); // New name
            pstmt.setInt(2, 200); // Existing sid to be updated

            // Execute the update statement
            int rowsUpdated = pstmt.executeUpdate();
            System.out.println("Rows updated: " + rowsUpdated);

            // Close the resources
            pstmt.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
