package sub7;

public class AbstractTest {
	public static void main(String[] args) {

		//추상클래슨느 객체 생성 불가
		//Animal animal = new Animal();
		
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		
		tiger.move();
		eagle.move();
		
		tiger.hunt();
		eagle.hunt();
	}

}
