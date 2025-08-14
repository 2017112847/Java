package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import sub2.User1VO;


public class PrepareSelectTest {
public static void main(String[] args) {

	final String HOST = "jdbc:oracle:thin:@localhost:1521:xe";
	final String USER = "dydwns";
	final String PASS = "1234";
	
	List<User1VO> users = new ArrayList<User1VO>();
	try {
		Connection conn =  DriverManager.getConnection(HOST,USER,PASS);
		String sql = "SELECT * FROM USER1 WHERE AGE >= ?";
		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setInt(1, 20);	// 첫번째 쿼리파리미터(?)에 나이 숫자 20 바인딩
		
		ResultSet rs = psmt.executeQuery();	//select 실행하기때문에 executeQuery()로 실행해야 resultset 반환됨
		
		while(rs.next()) {
			//VO 객체 생성 : VO 객체는 데이터베이스에서 조회된 결과를 초기화된 읽기 전용 객체
			User1VO vo = new User1VO();
			vo.setUser_id(rs.getString(1));
			vo.setName(rs.getString(2));
			vo.setHp(rs.getString(3));
			vo.setAge(rs.getInt(4));
			
			users.add(vo);
		}
		
		rs.close();
		psmt.close();
		conn.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	for(User1VO user : users) {
		System.out.println(user);
	}
	
	System.out.println("select 완");
}
}
