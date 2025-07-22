package sub1;

public class FruitBox <T>{	//generic 클래스 fruitbox 에 치환변수 t 를 선언
	private T fruit;
	
	public T getFruit() {
		return fruit;
	}
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
}