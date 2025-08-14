package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferStreamTest {public static void main(String[] args) {
	String source = "C:\\Users\\GGG\\Desktop\\person.tif";
	String target = "C:\\Users\\GGG\\Desktop\\person2.tif";
	try {	//기본 스트림 생성
		FileInputStream fis = new FileInputStream(source);
		FileOutputStream fos = new FileOutputStream(target);
		
		//보조 스트림
		BufferedInputStream bis = new BufferedInputStream(fis)	;;
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		//	무한반복으로 스트림 작업 수행
		while(true) {
			// 파일 읽기
			int data = fis.read();
			if(data == -1){
				//파일 내용이 없으면
				break;
			}
			
			// 파일 쓰기
			fos.write(data);
			
		}
		//스트림 작업 종료
		fis.close();
		fos.close();
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("end");
}

}
