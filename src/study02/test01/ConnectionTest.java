package study02.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// String을 Class로 인식
public class ConnectionTest {
	public static void main(String[] args) {		
		try {
			// 1) Find the appropriate Oracle Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2) Enter connection information
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "bdi";
			String pwd = "12345678";
			
			// 3) Get connected
			Connection con = DriverManager.getConnection(url, id, pwd);
			// 여기에서는 " " 사이에 ; 찍지 않음
			// 4) Open query editor 
			Statement stmt = con.createStatement();
			// 5) Write a query
			String sql = "select * from user_info";
			// 6) Execute the query (just on the metadata level (ex) ID, PWD, NAME, AGE, ETC)
			ResultSet rs = stmt.executeQuery(sql);
			// 7) Show the entered data
			while(rs.next()) {
				System.out.println(rs.getString("id"));
			}
		} catch (ClassNotFoundException| SQLException e) {
			// https://docs.oracle.com/javase/6/docs/api/java/lang/Throwable.html#printStackTrace()
			e.printStackTrace();
		}
	}
}
