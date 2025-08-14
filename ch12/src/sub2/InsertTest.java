package sub2;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertTest {
public static void main(String[] args) {

	// db정보 
			String host = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "dydwns";
			String pass = "1234";
			
			Connection conn = null;
	try {
		//	db 접속
		conn = DriverManager.getConnection(host, user, pass);
//	sql 실행 객체 생성	(statement, preparedstatement)
		Statement stmt =  conn.createStatement();
		
//	sql 실행
		String sql = "INSERT INTO USER1 VALUES ('j101', '김병신', '010-3332-2131', '31')";
		stmt.executeUpdate(sql);
		
//	결과처리(select문일경우)
	} catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}finally {
//		db 종료
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	System.out.println("end");
}
}
