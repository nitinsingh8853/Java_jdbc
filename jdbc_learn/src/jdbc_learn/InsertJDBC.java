package jdbc_learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class InsertJDBC {

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
			String q="create table table1(tId int(20) primary key auto_increment,"
					+ "tName varchar(200) not null,tCity varchar(400))";
			// String q="create table images(id int primary key auto_increment,pic blob);";
			Statement stmt=con.createStatement();
			stmt.executeUpdate(q);
			System.out.println("Table Created in database..");
			con.close();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
