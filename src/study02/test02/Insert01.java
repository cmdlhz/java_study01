package study02.test02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Insert01 {
	public static void main(String[] args) throws ClassNotFoundException {

		Connection con = null;
		try {
			con = DriverManager.getConnection(ConnectionTest05.URL, ConnectionTest05.ID, ConnectionTest05.PWD);
			// 'space'를 붙이는 습관을 들이자!
			String sql = "insert into user_info(id, pwd, name, age, etc) ";
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter your information with \",\"");
			String info = scan.nextLine();
			
			String[] infos = info.split(",");
			sql += "values(";
			for(int i=0; i<infos.length;i++) {
				sql += "'" + infos[i] + "',";
			}
			sql = sql.substring(0, sql.length()-1);
			sql += ")";
			
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			System.out.println("# of Inserted items : " + result);
			
			System.out.println(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

/*
 *  === 유효성 검사 (data validation) ===
 * 1) 실수
 *  2) 악의적 
 * 으로 데이터가 부정확하게 입력되는 것을 방지하기 위해
 */