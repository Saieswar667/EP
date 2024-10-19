package s13.jdbcAPP;

/**
 * Hello world!
 *
 */
import java.sql.*;
public class App
{
 public static void main( String[] args ) throws Exception
 {
 String url = "jdbc:mysql://localhost:3306/student_db";
String username = "root";
 String password = "Durgarao@2";
 Class.forName("com.mysql.cj.jdbc.Driver");
 Connection con = DriverManager.getConnection(url, username, password);
 Statement stmt = con.createStatement();
 ResultSet rs = stmt.executeQuery("select * from klu_students");
 while(rs.next())
 {
System.out.println("Student ID: " + rs.getInt(1));
 System.out.println("Student Name: " + rs.getString(2));
 }
 con.close();
 }
}