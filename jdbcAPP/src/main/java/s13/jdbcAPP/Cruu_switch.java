package s13.jdbcAPP;
import java.sql.*;
import java.util.Scanner;

public class Cruu_switch {
	public static void main(String[] args) {
		 String url = "jdbc:mysql://localhost:3306/student_db";
		 String username = "root";
		 String password = "Durgarao@2";
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("CRUD Operations:");
		 System.out.println("1. Create");
		 System.out.println("2. Read");
		 System.out.println("3. Update");
		 System.out.println("4. Delete");
		 System.out.print("Enter your choice: ");
		 int choice = scanner.nextInt();
		 try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con = DriverManager.getConnection(url, username, password);
		 switch (choice) {
		 case 1:
		 System.out.print("Enter student ID: ");
		 int sid = scanner.nextInt();
		 System.out.print("Enter student name: ");
		 String sname = scanner.next();
		 createStudent(con, sid, sname);
		 break;
		 case 2:
		 readStudents(con);
		 break;
		 case 3:
		 System.out.print("Enter student ID: ");
		 int updateSid = scanner.nextInt();
		 System.out.print("Enter new student name: ");
		 String updateSname = scanner.next();
		 updateStudent(con, updateSid, updateSname);
		 break;
		 case 4:
		 System.out.print("Enter student ID: ");
		 int deleteSid = scanner.nextInt();
		 deleteStudent(con, deleteSid);
		 break;
		 default:
		 System.out.println("Invalid choice");
		 }
		 con.close();
		 } catch (ClassNotFoundException | SQLException e) {
		 System.out.println("Error: " + e.getMessage());
		 }
		 }
		 public static void createStudent(Connection con, int sid, String sname) throws
		SQLException {
		 PreparedStatement pstmt = con.prepareStatement("insert into klu_students values (?, ?)");
		 pstmt.setInt(1, sid);
		 pstmt.setString(2, sname);
		 pstmt.executeUpdate();
		 }
		 public static void readStudents(Connection con) throws SQLException {
		 Statement stmt = con.createStatement();
		 ResultSet rs = stmt.executeQuery("select * from klu_students");
		 while (rs.next()) {
		 System.out.println("Student ID: " + rs.getInt("sid"));
		 System.out.println("Student Name: " + rs.getString("sname"));
		 }
		 }
		 public static void updateStudent(Connection con, int sid, String sname) throws
		SQLException {
		 PreparedStatement pstmt = con.prepareStatement("update klu_students set sname = ? where sid = ?");
		 pstmt.setString(1, sname);
		 pstmt.setInt(2, sid);
		 pstmt.executeUpdate();
		 }
		 public static void deleteStudent(Connection con, int sid) throws SQLException {
		 PreparedStatement pstmt = con.prepareStatement("delete from klu_students where sid = ?");
		 pstmt.setInt(1, sid);
		 pstmt.executeUpdate();
		 }

}
