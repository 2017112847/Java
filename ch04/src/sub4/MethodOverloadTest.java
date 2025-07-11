package sub4;
/**
 * 25.7.9
 * 매소드 오버로드 실습
 */
public class MethodOverloadTest {public static void main(String[] args) {
	int r1 = add(3);
	int r2 = add(2, 3);
	double r3 = add(1.1, 3.14);
	String r4 = add("Hello","Java");
	String r5 = add("number", 1);
	
	System.out.println("r1 : " + r1);
	System.out.println("r2 : " + r2);
	System.out.println("r3 : " + r3);
	System.out.println("r4 : " + r4);
	
}

//오버로드 매소드 정의
public static int add(int a) {
	return a +1;
}

public static int add(int a, int b) {
	return a +b;
}

public static double add(double a, double b) {
	return a + b;
}

public static String add(String a, String b) {
	return a + b;
}
public static String add(String a, int b) {
	return a + b;
}



}
