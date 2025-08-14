package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteTest {
public static void main(String[] args) {
	String host = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "dydwns";
	String pass = "1234";
	
	try {
//		데이터 베이스 연결
		Connection conn = DriverManager.getConnection(host,user,pass);
		
//		sql 실행객체 생성
		Statement stmt = conn.createStatement();
//		sql 실행
		String sql = "DELETE FROM USER1 WHERE USER_ID='j101'";
		stmt.executeUpdate(sql);
//		결과 처리(select 일 경우)
		
		
		
//		db 종료
		stmt.close();
		conn.close();
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	System.out.println("delete 완");
}
}
