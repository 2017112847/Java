package sub3;
// 클래스 설계
public class Car {
	//속성(멤버변수, 필드) - 무조건 private 선언
	private String name;
	private String color;
	private int speed;
	
	//전체 차량 수를 저장하는 클래스 변수
	public static int count; //클래스 변수(정적변수)는 일반적으로 public
	
	
	
	//생성자 정의 - 속성을 초기화 하는반환타입이 없고 클래스이름이 그대로 메소드 이름으로 사용
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		count++;	//차량증가
	}
	
	
	//기능(멤버 메소드) - 무조건 public 선언
	public void speedUp(int speed) {
		// this 는 자기 참조 키워드, 쿨래스의 맴버면수 참조
		this.speed += speed;
		
	}
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	public void show() {
		System.out.println("차 :" + name);
		System.out.println("색 :" + color);
		System.out.println("속도 :" + speed);
	}
	
	// Getter/Setter - 은닉된 속성을 안전하게 ㅓ리하기 위한 메소드
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Car.count = count;
	}
}
