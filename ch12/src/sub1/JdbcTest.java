package sub1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// jdbc 
public class JdbcTest {
	public static void main(String[] args) {
		// db정보 
		String host = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "dydwns";
		String pass = "1234";
		
		//db 접속
		try {
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			if( conn != null) {
				System.out.println("성공");
			}else {
				System.out.println("실패");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
