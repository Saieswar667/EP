package com.klu.jdbc_callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.Types;

public class outparam {

	
		public static void main( String[] args ) throws SQLException
	    {
	       String url="jdbc:mysql://localhost:3306/klu";
	       String username="root";
	       String password ="Durgarao@2";
	       Connection con =DriverManager.getConnection(url,username,password);
	       CallableStatement stmt= con.prepareCall("{CALL getDetailsOutParam(?)}");
	       stmt.registerOutParameter(1, Types.INTEGER);
	       stmt.execute();
	       int cnt = stmt.getInt(1);
	       
	       
	       
	    	   System.out.println("No of rows prent in employee table : "+cnt);
	    	   
	       
	    	   con.close();
	    
	    }

	

}
