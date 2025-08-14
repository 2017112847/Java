package sub3;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

//	직렬화
public class SerializeTest {public static void main(String[] args) {
	Apple apple = new Apple("한국",3000);
	String path = "C:\\Users\\GGG\\Desktop\\apple.data";
	try {
		FileOutputStream fos = new FileOutputStream(path);
		// 직렬화를 위한 기본스트링과 보조스트림 생성
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		// 객체 직렬화
		oos.writeObject(apple);
		// 스트림 종료
		oos.close();
		fos.close();
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	System.out.println("end");
}

}
