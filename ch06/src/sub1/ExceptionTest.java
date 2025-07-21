package sub1;

import java.lang.reflect.Constructor;

//예외처리
public class ExceptionTest {public static void main(String[] args) {
	
	//실행 예외(runtime) - 프로그램이 실행 중에 발생하는 에러
	//예외상황1 - 어떤 수를 0으로 나눌때
	int num1 = 1;
	int num2 = 0;
	
	try {
	int r1 = num1 + num2;
	int r2 = num1 - num2;
	int r3 = num1 * num2;
	int r4 = num1 / num2;
	
	System.out.println("r4 : " + r4);
	
	}catch (Exception e) {
	System.out.println("예외내용 :" + e.getMessage());
	}
	
	//예외상황2 - 배열 인덱스 참조가 잘못되었을때
	int [] arr = {1,2,3,4,5};
	try {
	
	for( int i=0; i<= arr.length ; i++) {
	System.out.println();
	}
	}catch (Exception e) {
		e.printStackTrace();
	}
	//예외상황3 - 객체생성 안하고 메소드 호출
	Animal animal = null;
	
	try {
		animal.move();
	}catch (Exception e) {
			e.printStackTrace();
		}
	//예외상황4 - 잘못된 캐스팅
	Animal a1 = new Tiger();
	Animal a2 = new Eagle();
	
	try {
	Tiger tiger = (Tiger) a2; 	//잘못된 다운캐스팅
	}catch (ClassCastException e) {
		e.printStackTrace();
		
	}
	//일반 예외(compile-time) - 프로그램을 실행하기 전에 발생하는 에러
	try {
		Class cs = Class.forName("sub1.Tiger");	//	문자열 정보로 클래스 로드
		Constructor<?> constructor = cs.getDeclaredConstructor();
		Tiger tiger = (Tiger) constructor.newInstance();
		
		tiger.move();
		tiger.hunt();
	
	}catch (Exception e) {
		e.printStackTrace();
	}
	
	System.out.println("프로그램 종료");
}

}
