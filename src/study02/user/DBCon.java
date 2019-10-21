package study02.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {
	private static final String DRIVER_NAME;
	private static final String URL;
	private static final String ID;
	private static final String PWD;
	
	static {
		DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
		URL ="jdbc:oracle:thin:@localhost:1521:xe";
		 ID = "bdi";
		 PWD = "12345678";
		 
		try {
			Class.forName(DRIVER_NAME);
		} catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	private static Connection con;
	
	// getCon()을 통해서만 접근
	// 이걸 통해서만 접근할 예정
	public static Connection getCon() {
		if(con == null) {
			try {
				con = DriverManager.getConnection(URL, ID, PWD);
			} catch (SQLException e){
			e.printStackTrace();
			}
		}
		return con;
	}
//	
//	public static void main(String[] args) {
//		Connection con = getCon();
//	}
}
