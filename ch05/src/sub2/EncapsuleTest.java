package sub2;
/**
 * 25.7.14
 * 캡술화
 * 
 * 캡슐화(정보은닉, Encapsulation)
 * -캡슐화는 객체의 속성을 외부에서 참조하지 못하게 객체의 속석을 은닉하는 특성
 * -클래스의 속성을 반드시 private로 선언
 * -private 선언을 하면 생성자로 속성을 초기화
 * -은닉된 정보를 안전하게 사용하기 위해
 */
public class EncapsuleTest {
	public static void main(String[] args) {
		//객체 생성
		Car sonata = new Car("소나타", "쥐색", 0);	//생성자 호ㅜㄹ
		
		//초기화 은닉된거는 생성자로 초기화
		sonata.speedDown(100);
		sonata.speedDown(40);
		sonata.show();
		
		
		Car avante = new Car("아반테", "흰색", 0);
		avante.speedUp(80);
		avante.speedDown(30);
		avante.show();
		//개별 속성이 은닉되어 있기 때문에 속성 수정 불가, Setter로 수정
		//avante.color = "검정색";
		avante.setColor("남색");
		avante.show();
		
		//Account 객체 생성과 초기화 - 부산은행,3211,ㅂㅂㅂ,10000 = 출력 30000
		Account bs = new Account("부산은행","3211","ㅂㅈㅈ", 10000);
		
		bs.bank = "부산은행";
		bs.id = "3211";
		bs.name = "ㅂㅈㅈ";
		bs.balance = 10000;
		
		bs.withdraw(0);
		bs.deposit(20000);
		bs.show();
		
		bs.setName("e2e");
		bs.show();
		
		Account us = new Account("우리은행","4444","흫ㅎㅎ",30000);
		
		us.bank = "우리은행";
		us.id = "4444";
		us.name = "홓ㅎㅎ";
		us.balance = 30000;
		
		us.withdraw(0);
		us.deposit(20000);
		us.show();
	}

}
