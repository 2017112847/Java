package sub2;
/**
 * 25.7.9
 * 매소드 실습
 */

public class MethodTest {public static void main(String[] args) {
	int y1 = f(1);
	int y2 = f(2);
	int y3 = f(3);
	
	System.out.println("y1 : " + y1);
	System.out.println("y2 : " + y2);
	System.out.println("y3 : " + y3);
	
	int total1 = sum(1,10);
	int total2 = sum(1,100);
	
	System.out.println("total1 :" + total1);
	System.out.println("total2 :" + total2);
}
public static int f(int x) {
	int y=  2*x + 3;
	return y;
	
}
public static int sum(int start, int end) {
	int total = 0;
	for (int k= start ; k<= end; k++) {
		total += k;
	}
	return total;
	
	
}

}
