package sub3;


/**
 * 25.7.14
 * static 변수 ,static 메소드 실습
 * 
 * 클래스 변수(정적 변수), 클래스 메소드(정적 메소드)
 * - static 으로 선언한 변수와 메소드
 * - Method Area 영역에 따로 관리 됨
 * - new 객체 생성없이 바로 클래스 타입으로 참조
 * - 객체(인스턴스) 간의 데이터 공유 목적으로 활용
 * 
 */

class Increment{
	private int num1 = 0;
	public static int num2 = 0;	// 클래스 변수(정적변수)
	
	public Increment() {
		num1++;
		num2++;
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}
}


public class StaticTest {public static void main(String[] args) {
 
	//클래스 변수( 쩡적변수) 실습
	Increment inc1 = new Increment();
	Increment inc2 = new Increment();
	Increment inc3 = new Increment();
	//	전체 차량수 확인
	
	Car sonata = new Car("소나타", "쥐색", 0);
	Car avante = new Car("아반테", "흰색", 0);
	Car genesis = new Car("제네시스", "검정색", 0);
	
	sonata.show();
	avante.show();
	genesis.show();
	
	//클래스 메소드(정적메소드)는 클래스타입으로 참조 호출
	System.out.println("전체 차량수:" + Car.getCount());
	
	/**싱글톤 객체 실습
	 * -싱글톤 객체는 static 을 활용한 객체로 오직 하나의 인스턴스인 메모리성(Method Area)에 존재
	 * -싱글톤 객체를 사용해서 메모리 절약과 성능 향상을 기대
	 * - 외부 생성을 막기 위해 private 생성자 선언
	 */
	
	//여러개 겍채를 생성할 필요가 없는 객체
	//Calc cal = new Calc();
	//int result = cal.puls(1, 2);
	//System.out.println("result" + result);
	
	Calc c1 = Calc.getInstance();
	Calc c2 = Calc.getInstance();
	Calc c3 = Calc.getInstance();
	Calc c4 = Calc.getInstance();
	
	System.out.println("1 + 2 = "+ c1.puls(1, 2));

	System.out.println("2 - 1 = "+ c2.minus(2, 1));

	System.out.println("1 - 2 = "+ c2.minus(1, 2));

	System.out.println("2 * 3 = "+ c3.multi(2, 3));
	System.out.println("4 / 2 = "+ c4.div(4, 2));
}

}
