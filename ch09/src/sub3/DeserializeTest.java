package sub3;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//역 직렬화
public class DeserializeTest {public static void main(String[] args) {
	String path = "C:\\Users\\GGG\\Desktop\\apple.data";
	try {
		// 역 직렬화를 위한 기본스트림과 보조스트림 생성
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fis);
		//역 직렬화	외부의 객체파일을 내부의 객체로 불러오기
		Apple apple = (Apple) ois.readObject()	;
		apple.show();
		//스트림 종료
		ois.close();
		fis.close();
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}

}
