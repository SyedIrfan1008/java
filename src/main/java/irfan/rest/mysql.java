package irfan.rest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class mysql {

	public static Connection connect() {
		try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/Login", "root", "Arathi@123");
            return c;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
}
}
