package com.klu.jdbc_callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Inparam {

	public static void main( String[] args ) throws SQLException
    {
       String url="jdbc:mysql://localhost:3306/klu";
       String username="root";
       String password ="Durgarao@2";
       Connection con =DriverManager.getConnection(url,username,password);
       CallableStatement stmt= con.prepareCall("{CALL getDetailsById(?)}");
       stmt.setInt(1, 100);
       ResultSet res=stmt.executeQuery();
       while(res.next())
       {
    	   System.out.println(res.getInt(1) + "\t" + res.getString(2) + "\t" + res.getString(3));
    	   
       }
    	   con.close();
    
    }

}
