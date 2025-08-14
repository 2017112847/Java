package sub1;
//	람다식 실습
@FunctionalInterface
interface A {
	public int method (int a, int b);
}
@FunctionalInterface
interface B{
	public void method( double a);
}
@FunctionalInterface
interface C{
	public boolean method();
}
@FunctionalInterface
interface D{
	public void method();
}
@FunctionalInterface
interface E{
	public double method(double num);
}
public class LambdaTest {public static void main(String[] args) {
	// 람다식 정의
	A a1 = (int a, int b) -> {
		int c = a+ b;
		return c;
	};
	A a2 = (a, b) -> {return a+b;};
	A a3 = (a,b)->a+b;	//{}생략은 return
	// 람다식 호출
	int r1 = a1.method(1, 2);
	int r2 = a2.method(2, 3);
	int r3 = a3.method(3, 4);
	System.out.println("r1 = "+ r1);
	System.out.println("r2 = "+ r2);
	System.out.println("r3 = "+ r3);
	//B 인터페이스 람다식
	B b1 = (double a) -> {
		System.out.println("b1 - a : "+a);
	};
	B b2 = a -> System.out.println("b2 - a : "+a);
	B b3 = System.out::println;	// 메도드 참조 연산자
	b1.method(1);
	b1.method(2);
	b1.method(3);
	// c
	C c1 = () -> { return true;};
	C c2 = () -> false;
	boolean br1 = c1.method();
	boolean br2 = c2.method();
	System.out.println("br - 1"+ br1);
	System.out.println("br - 2"+ br2);
	//D
	D d1 = () -> {System.out.println("d1 - ");};
	D d2 = () -> System.out.println("d2 - ");;
	d1.method();
	d2.method();
	//E
	E e1 = Math::ceil;
	E e2 = Math::floor;
	E e3 = Math::round;
	double num1 = e1.method(1.2);
	double num2 = e2.method(1.2);
	double num3 = e3.method(1.2);
	System.out.println("num1 :" + num1);
	System.out.println("num2 :" + num2);
	System.out.println("num3 :" + num3);
	// 람다식 이용한 스레드
	Runnable run =  () -> {
		for(int i =1 ; i<10 ; i ++) {
			System.out.println("run : "+i);;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};
	Thread tr = new Thread(run);
	tr.start();
	System.out.println("end");
}
}