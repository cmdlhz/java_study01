package study02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConnectionTest02 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "bdi";
			String pwd = "12345678";
			
			Connection con = DriverManager.getConnection(url, id, pwd);
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
		}
	}
}
