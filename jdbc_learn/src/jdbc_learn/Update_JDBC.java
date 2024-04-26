package jdbc_learn;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
public class Update_JDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con=ConnectionProvider.getConnection();
			String q="update table1 set tName=? , tCity=? where tId=?";
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter new name : ");
			String name=br.readLine();
			System.out.println("Enter new city : ");
			String city=br.readLine();
			System.out.println("Enter the student id : ");
			int id=Integer.parseInt(br.readLine());
			PreparedStatement pstmt=con.prepareStatement(q);
			pstmt.setString(1, name);
			pstmt.setString(2, city);
			pstmt.setInt(3, id);
			pstmt.executeUpdate();
			System.out.println("Done....");
			
			con.close();
			
		}
		catch(Exception e) {
			
		}
	}

}
