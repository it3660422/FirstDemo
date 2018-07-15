package Controller;

import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;
import Model.*;

public class FirstDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Test");
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Properties properties = new Properties();
			properties.setProperty("user", "root");
			properties.setProperty("password", "password");
			properties.setProperty("useSSL", "false");
			properties.setProperty("autoReconnect", "true");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nay", properties);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from users");
			ArrayList<UsersDto> lst = new ArrayList<UsersDto>();
			UsersDto a = new UsersDto();
			while (rs.next()) {
				a = new UsersDto();
				a.setName(rs.getString("name"));
				lst.add(a);
			}
			System.out.println(lst);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
