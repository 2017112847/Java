package sub1;
/**
 * 25.7.14
 * 객채지향 프로그래밍 클래스
 * 
 * 스택
 * -자바의 일반변수 ,참조변수 ,지역수가 push되어 저장되는 메모리의 영역
 * -해당 메소드 영역 및 프로그램이 종료되면 pop 되어 메모리에서 제거
 * -개게(참조변수)는 스택에서 HEap메모리 공간으 객체 인스턴스 참조(주소값 저장)
 * 
 * 힙
 * - 자바의 객체가 생성되는 메모리 공간,
 * - 스태거럼 순서대로 쌓이지 않고 랜덤으로 메모리 공간에 생성
 * - 참조변수가 제거되서 더이상 참조 되지 않으면 Gabage Collector로 해제됨
 */
public class ClassTest {public static void main(String[] args) {
	//객체 생성(인스턴스화)
	Car sonata = new Car();
	
	//객체 초기화
	sonata.name = "소나타";
	sonata.color = "쥐색";
	sonata.speed = 0;
	
	//객체 상호작영(기능 활용)
	sonata.speedUp(100);
	sonata.speedDown(40);
	sonata.show();
	
	//객체 생성, 초기하, ㅏㅅㅇ호작용
	Car avante = null;
	avante = new Car();
	
	
	avante.name = "아반테";
	avante.color = "흰색";
	avante.speed = 0;
	
	avante.speedUp(80);
	avante.speedDown(30);
	avante.show();
	
	/**
	 * 은행계좌 객체 생성
	 * 은행명 : 농협은행(nh)
	 * 계좌번호 : 1234
	 * 입금주 : ㅋㅋㅋ
	 * 현재 잔액 : 0
	 */
	Account nb = new Account();
	nb.bank = "농협으행";
	nb.id = "1234";
	nb.name = "ㅋㅋㅋ";
	nb.balance = 0;
	
	nb.deposit(1000);
	nb.withdraw(200);
	nb.show();
	
	Account kb = new Account();
		
	kb.bank = "국민은행";
	kb.id = "1233";
	kb.name = "ㅋㅋㅋ";
	kb.balance = 0;
	
	kb.withdraw(50000);
	kb.deposit(75000);
	kb.show();
}

}
