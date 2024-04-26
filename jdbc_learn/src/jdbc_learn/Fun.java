package jdbc_learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class Fun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//load the driver:
			Class.forName("com.mysql.cj.jdbc.Driver");
			// creating connection
			String url="jdbc:mysql://localhost:3306/youtube";
			String username="root";
			String pass="Nitinsingh@1234";
			Connection con=DriverManager.getConnection(url,username,pass);
			
			// Create Query
//			String q="insert into table1(tName,tCity) values (\"Aryan Yadav\",\"Lucknow\")";
//			Statement stmt=con.createStatement();
//			stmt.executeUpdate(q);
//			
			//get the PreparedStatement  object
			
			String q="insert into table1(tName,tCity) values (?,?)";
			PreparedStatement pstmt=con.prepareStatement(q);
			pstmt.setString(1,"Abhay Pratap");
			pstmt.setString(2, "Lucknow");
			
			pstmt.executeUpdate();
			System.out.println("Inserted..");
			con.close();
			

		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
