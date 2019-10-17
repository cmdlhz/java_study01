package study02.test02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectionTest05 {
	public static final String DRIVER_NAME;
	public static final String URL;
	public static final String ID;
	public static final String PWD;
	
	// 반드시 실행될 것이 있어야 할 때
	static {
		DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
		URL ="jdbc:oracle:thin:@localhost:1521:xe";
		 ID = "bdi";
		 PWD = "12345678";
		 
		try {
			// 이게 고장나면 JVM이 고장났다는 것 => 이건 신경쓰지 말자!
			Class.forName(DRIVER_NAME);
		} catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		Connection con = null;
		try {
			// 위에서 null이라고 선언하지 않으면 여기서 에러났을 때 null도 아니어서 에러남
			con = DriverManager.getConnection(URL, ID, PWD);
			// 띄어쓰기 안 하면 sql에서 에러 남
			String sql = "select * from user_info ";
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter an ID to search for : ");
			// WHERE id LIKE 'U%';
			String id = "'" + scan.nextLine() + "%'";
			sql += "where id like " + id;
			
			Statement stmt = con.createStatement();
			// 나중엔 이걸 쓸 것임 : sql을 읽어서 statement를 불러와라
//			PreparedStatement ps = con.prepareStatement(sql);
			
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getString("id"));
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}