package sub5;
//math
public class MathTest {public static void main(String[] args) {
	//math 클래스는 static 메소드로 기능 제공
	
	System.out.println("절대값"+Math.abs(-5));
	System.out.println("절대값"+Math.abs(5));
	System.out.println("제곱근"+Math.abs(9));
	System.out.println("제곱근"+Math.abs(16));
	System.out.println("올림값"+Math.ceil(1.2));
	System.out.println("올림값"+Math.ceil(1.8));
	System.out.println("내림값"+Math.floor(1.2));
	System.out.println("내림값"+Math.floor(1.8));
	System.out.println("반올림"+Math.round(1.2));
	System.out.println("반올림"+Math.round(1.8));
	//random 렌덤값
	double num1 = Math.random();
	System.out.println("num1"+num1);	// 0-1 사이 실수
	double num2 =num1*10;
	System.out.println("num2"+ num2);	// 0-10 사이 실수
	double num3 = Math.ceil(num2);
 	System.out.println("num3"+num3);	// 1-10 사이 실수
 	double rand = Math.ceil(Math.random()*46);	//1-46 까지 임의의 정수눈
 	System.out.println("rand "+ rand);
}

}
