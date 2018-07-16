package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbCon {
 public Connection con(){
	 Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Properties properties = new Properties();
			properties.setProperty("user", "root");
			properties.setProperty("password", "password");
			properties.setProperty("useSSL", "false");
			properties.setProperty("autoReconnect", "true");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nay", properties);
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		return con;

 }
}
