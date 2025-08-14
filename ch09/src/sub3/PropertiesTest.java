package sub3;

import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesTest {public static void main(String[] args) {
	//프로퍼티 : 키-값이 모두 문자열인 자료구조
	//Map<String, String> map = new hashmap(); 와 같음
	Properties prop = new Properties()	;
	prop.setProperty("A", "Apple");
	prop.setProperty("B", "Banana");
	prop.setProperty("C", "Cherry");
	System.out.println(prop);
	
	//직렬화
	String path = "C:\\Users\\GGG\\Desktop\\fruit.properties";
	try {
		FileOutputStream fos = new FileOutputStream(path);
		prop.store(fos, null);
		fos.close();
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	System.out.println("end");
}

}
