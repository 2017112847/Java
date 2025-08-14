package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedinsertTest {
public static void main(String[] args) {
	
	final String HOST = "jdbc:oracle:thin:@localhost:1521:xe";
	final String USER = "dydwns";
	final String PASS = "1234";
	
	try {
//		db 접속
		Connection conn =  DriverManager.getConnection(HOST,USER,PASS);
		
//		sql 실행객체 생성(preparedstatement)
		String sql = "INSERT INTO USER1 VALUES (?,?,?,?)";
		PreparedStatement psmt = conn.prepareStatement(sql);
		
		// 각 쿼리 파라미터를 바인딩(매핑, 서칭)
		psmt.setString(1, "p101");
		psmt.setString(2, "김유신");
		psmt.setString(3, "010-1222-3333");
		psmt.setInt(4, 34);
		
//		sql 실행
		psmt.executeUpdate();	//insert,delete,update는 exeuteupdate() 실행
		
//		결과 처리(select일 경우)
		
		
//		db 종료
		psmt.close();
		conn.close();
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	System.out.println("insert 완");
}
}
