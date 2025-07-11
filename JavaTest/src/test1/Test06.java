package test1;

import java.util.Scanner;

public class Test06 {public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("x :");
	int x = sc.nextInt();
	
	System.out.print("y :");
	int y = sc.nextInt();
	
	String result = x > y ? "x가 크다." : "y가 크다";
	System.out.println(result);
	
}

}
