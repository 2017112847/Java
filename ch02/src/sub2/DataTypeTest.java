package sub2;

/**
 * 25/7/7
 * wdw
 * 변수 자료형 실습
 */
public class DataTypeTest {
	public static void main(String[] args) {
		//정수횽
		byte	NUM1 = 127;	//1byte	
		short	NUM2 = 32767;	//2byte
		char	NUM3 = 97;	//2 byte	
		int		NUM4 = 2147483647;	//4 byte	
		long	NUM5 = 9223372036854775807L;	//8 byte
		
		System.out.println("NUM1 : " + NUM1);
		System.out.println("NUM1 : " + NUM2);
		System.out.println("NUM1 : " + NUM3);
		System.out.println("NUM1 : " + NUM4);
		System.out.println("NUM1 : " + NUM5);
		//실수
		float var1 = 0.123456789f;		//4 byte	
		double var2 = 0.987654321;		//8 byre
		
		System.out.println("var1 :" + var1);
		System.out.println("var2 :" + var2);
		//논리
		boolean value1 = true;
		boolean value2 = false;
		
		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		
		//문자
		char c1 = 'A';
		char c2 = '가';
		
		System.out.println("c1 :" + c1);
		System.out.println("c2 :" + c2);
		
		int n1 = c1;	//char는 정수형 타입이라서 int형으로 대입가능
		System.out.println("n1 :" + n1);
		
		//문자
		String s1 = "A";
		String s2 = "가";
		String s3 = "Apple";
		String s4 = "카카";
		
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("s3 : " + s3);
		System.out.println("s4 : " + s4);
	}

}
