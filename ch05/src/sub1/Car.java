package sub1;
// 클래스 설계
public class Car {
	//속성(멤버변수, 필드)
	String name;
	String color;
	int speed;
	//기능(멤버 메소드)
	public void speedUp(int speed) {
		// this는 자기 참조 키워드, 쿨래스의 맴버면수 참조
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
}
