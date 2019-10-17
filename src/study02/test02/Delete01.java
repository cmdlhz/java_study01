package study02.test02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Delete01 {
	public static void main(String[] args) {
		Connection con = null;
		try {
			con = DriverManager.getConnection(ConnectionTest05.URL, ConnectionTest05.ID, ConnectionTest05.PWD);
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter an ID that you want to delete: ");
			String id = scan.nextLine();
			String sql = "Delete user_info where id = '" + id + "' ";
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			System.out.println("# of deleted items : " + result);
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
