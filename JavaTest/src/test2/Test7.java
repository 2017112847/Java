package test2;

public class Test7 {public static void main(String[] args) {
	System.out.println("1,5의 쵀대공약수 :" + gcd(1, 5));
	System.out.println("3,6의 쵀대공약수 :" + gcd(3, 6));
	System.out.println("12,18의 쵀대공약수 :" + gcd(12, 18));
	System.out.println("60,24의 쵀대공약수 :" + gcd(60, 24));
	System.out.println("192,162의 쵀대공약수 :" + gcd(192, 162));
}
public static int gcd(int a , int b) {
	int temp = 0;
	if (a < b) {
		temp= a;
	}else {
		temp = b;
	}
	while(true) {
		if(a % temp == 0 && b % temp == 0) {
			break;
		}
		temp-- ;
	}
	return temp;
}

}
