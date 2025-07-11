package sub2;

import java.util.Scanner;

/**
 * 25/7/8
 * wdw
 * switch조건문 실습
 */

public class SwitchTest {
	public static void main(String[] args) {
		System.out.print("숫자 입력 :");
		// y사용자 입력
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		System.out.println("입력한 숫자 :" + number);
		
		switch(number % 2) {
		case 0:
			System.out.println("number 짝수다");
			break;
		
		case 1:
			System.out.println("number 홀수다");
			break;
		}
	}

}
