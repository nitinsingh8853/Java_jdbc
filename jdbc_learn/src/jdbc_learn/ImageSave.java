package jdbc_learn;
import java.io.*;
import java.sql.*;
public class ImageSave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/youtube";
			String uname="root";
			String pass="Nitinsingh@1234";
			Connection con=DriverManager.getConnection(url, uname, pass);
			String q="insert into images(pic) values(?)";
			
			PreparedStatement pstmt=con.prepareStatement(q);
			FileInputStream fis=new FileInputStream("C:\\Users\\nitin\\OneDrive\\Desktop\\Nitin\\NitinSign.jpg");
			pstmt.setBinaryStream(1,fis,fis.available());
			pstmt.executeUpdate();
			System.out.println("Done...");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
