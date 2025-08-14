package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateTeat {
public static void main(String[] args) {
	
	String host = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "dydwns";
	String pass = "1234";
	
	try {
		Connection conn = DriverManager.getConnection(host,user,pass);
		Statement stmt = conn.createStatement();
		
		String sql = "UPDATE USER1 SET AGE=35 WHERE USER_ID='j101'";
		stmt.executeUpdate(sql);
		
		stmt.close();
		conn.close();
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	System.out.println("update 완");
}
}

