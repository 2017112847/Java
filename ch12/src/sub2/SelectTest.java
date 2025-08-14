package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class SelectTest {
public static void main(String[] args) {
	
			final String HOST = "jdbc:oracle:thin:@localhost:1521:xe";
			final String USER = "dydwns";
			final String PASS = "1234";
			
		//조화결과 반환용 리스트
			List<User1VO> users = new ArrayList<>();
			
	try {
		
//		db 접속
		Connection conn =  DriverManager.getConnection(HOST,USER,PASS);
		
//		sql 실행객체 생성
		Statement stmt = conn.createStatement();
//		sql 실행
		String sql = "SELECT * FROM USER1";
		ResultSet rs =  stmt.executeQuery(sql);	//select 문의 executeQuerry 로 실해행하고 result로 반환
		
//		결과처리(일반적으로 리스트 생성)
		while(rs.next()) {	//커서를 다음 row로 이동, 이동할 row 가 없으면 false
			
			// 커서가 가리키는 row의 각 칼럼값을 추출
		
			
			User1VO vo = new User1VO();
			vo.setUser_id(rs.getString(1));
			vo.setName(rs.getString(2));
			vo.setHp(rs.getString(3));
			vo.setAge(rs.getInt(4));
			
			users.add(vo);
		}
				
//		db 종료
		rs.close();
		stmt.close();
		conn.close();
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	for(User1VO user: users) {
		System.out.println(user);
		
	}
	
	System.out.println("select 완");
}
}
