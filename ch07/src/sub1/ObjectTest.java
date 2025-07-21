package sub1;
//object
public class ObjectTest {public static void main(String[] args) {
	//자바의 모든 클래스는 Object를 상속하기 때문에 Object타입으로 업캐스팅 가능
	Object a1 = new Apple("한국", 3);
	Object a2 = new Apple("미국", 3);
	//toString() - 객체정보 조회
	System.out.println(a1.toString());
	System.out.println(a2); // toString() 은 default 매소드이기 때문에 객체이름으로 출력 ㄱㄴ
	
	if(a1 == a2) {
		System.out.println("a1=a2 주소값");
	}else {
		System.out.println("a1 not= a2 주소값");
	}
	if (a1.equals(a2)) {
		System.out.println("a1 = a2객체");
	}else {
		System.out.println("a1 not = a2 객체");
	}
	System.out.println("a1 해시값 : " + a1.hashCode());
	System.out.println("a2 해시값 : " + a2.hashCode());
}

}
