package sub4;

public class Person{
	private String name;
	private int age;
	
	public Person(String name1, int age) {
		
		this.age = age;
		this.name = name;	
	}
	public void work() {
		System.out.println("person is working");
	
	}
	public void introduce(String name, int age) {
		System.out.println("제 이름은 "+ this.name +"이고 나이는"+ this.age + "세 입니다");
	}

}
