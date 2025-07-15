package sub4;
// 클래스 설계
public class Car {
	//속성(멤버변수, 필드) - 무조건 private 선언, 상속관계에서 브무 클래스면 protected 로 선언
	private String name;
	private String color;
	protected int speed;	// 상속관계에서 자식클래스에서 참조 가능하게 접근권한을 protected 로 변경
	
	//생성자 정의 - 속성을 초기화 하는반환타입이 없고 클래스이름이 그대로 메소드 이름으로 사용
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	
	
	//기능(멤버 메소드) - 무조건 public 선언
	public void speedUp(int speed) {
		// this 는 자기 참조 키워드, 쿨래스의 맴버면수 참조
		this.speed += speed;
		
	}
	public void speedDown(int speed) {	this.speed -= speed;}
	public void show() {
		System.out.println("차 :" + name);
		System.out.println("색 :" + color);
		System.out.println("속도 :" + speed);
	}
	
	// Getter/Setter - 은닉된 속성을 안전하게 ㅓ리하기 위한 메소드
	public String getColor() {	return color;}
	public void setColor(String color) {
		this.color = color;
	}
	
}
