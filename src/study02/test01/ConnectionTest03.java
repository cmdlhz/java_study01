package study02.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConnectionTest03 {
	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "bdi";
			String pwd = "12345678";
			
			//
			con = DriverManager.getConnection(url, id, pwd);
			
			Statement stmt = con.createStatement();
			String sql = "select * from user_info";
			ResultSet rs = stmt.executeQuery(sql);
			
			List<Map<String, String>> userList = new ArrayList<Map<String, String>>();
			
			while(rs.next()) {
				Map<String, String> userMap = new HashMap<String, String>();
				userMap.put("id", rs.getString("id"));
				userMap.put("pwd", rs.getString("pwd"));
				userMap.put("name", rs.getString("name"));
				userMap.put("age", rs.getString("age"));
				userMap.put("etc", rs.getString("etc"));
				userList.add(userMap);
			}
			System.out.println(userList);
		}catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		} finally {
			// 전화 연결은 됐다
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// 전화기가 고장났어요오오오오
					e.printStackTrace();
				}
			}
		}
	}
}