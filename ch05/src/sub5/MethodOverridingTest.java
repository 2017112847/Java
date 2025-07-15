package sub5;
/**
 * 07.15 메소드 오버라이딩
 */
class aaa{
	public void method1() {
		System.out.println("aaa:method1...");
	}
	public void method2() {
		System.out.println("aaa:method2...");
	}
	public void method3() {
		System.out.println("aaa:method3...");
	}
}
class bbb extends aaa{
	@Override
	public void method2() {
		// 부모클래스 method2를 Override 하기때문에 이노테이션 @Override 표시
		System.out.println("bbb:method2...");
	}
	public void method3(int a) {	// Overload 메소드
		System.out.println("bbb:method3...");
	}
}
class ccc extends bbb{
	@Override
	public void method1() {
		System.out.println("ccc:method1...");
	}
	@Override
	public void method2() {
		System.out.println("ccc:method2...");
	}
	public void method3(int a, int b) {		//Overload 메소드
		System.out.println("ccc:method3...");
	}
}

public class MethodOverridingTest {public static void main(String[] args) {
	//	오버라이드 메소드 실습
	ccc c =new ccc();
	c.method1();
	c.method2();
	c.method3();
	c.method3(1);
	c.method3(1, 2);
	
	//	Sedan 클래스 오버라이드 메소드 실습
	Sedan sonata = new Sedan("소나타","흰색",0,2000);
	sonata.speedUp(2000);
	sonata.show();
}
}