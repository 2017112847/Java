package sub6;
/**
 * 25.07.15
 * 다향성(Polymorphism)
 * - 상속관계에서 부모클래스의 기능이 자식 클래스에서 다양한 형태로 변하는 특징
 * - 객체 생성할때 타입선언을 부모클래스 타입으로 선언(업캐스팅)
 * - 다향성을 통해 프로그래밍의 중복코드를 줄이고 유연성 향상
 */
public class PolyTest {public static void main(String[] args) {
	// 다형성 - 자식 객체의 타입선언을 부모타입으로 선언
	Animal tiger = new Tiger();	//업캐스팅
	Animal eagle = new Eagle();	//업캐스팅
	Animal bear = new Bear();	//업캐스팅
	
	tiger.move();
	tiger.hunt();
	
	eagle.move();
	eagle.hunt();
	
	bear.move();
	bear.hunt();
	
	//다운 캐스팅 - 부모타입의 객체를 자식타입으로 캐스팅(형변환)
	Tiger t = (Tiger) tiger;
	Eagle e = (Eagle)eagle;
	Bear b = (Bear) bear;
	
	t.move();
	t.hunt();
	e.move();
	e.hunt();
	b.move();
	b.hunt();
	
	//다형성을 활용한 객체 배열
	Animal[] arr = {t,e,b};
	arr[0].move();
	arr[1].move();
	arr[2].move();
	
	Dog dog = new Dog();
	Cat cat = new Cat();
	
	printSound(dog);
	printSound(cat);
	
	
//	dog.makeSound();
//	cat.makeSound();

}
	public static void printSound(Pet pet) {
		pet.makeSound();
	}
}
