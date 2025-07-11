package sub4;
/**
 * 25/7/8
 * wdw
 *while 반복문
 */

public class WhileTest {
	public static void main(String[] args) {
		//1-10 합
		int sum = 0;
		int k = 1;
		while(k <= 10) {
			sum += k;
			k++;
		}
		System.out.println("1-10 합:"+sum);
		
		//do-while
		int tot = 0;
		int j = 1;
		
		do {
			if(j % 2 == 0) {
				tot += j;
			}
			j++;
			
		}while(j <= 10);
		System.out.println("1-10 짝수 합:"+ tot);
		
		//break
		int num = 1;
		while(true) {
			
			if(num % 5 == 0 && num % 7 == 0) {
				break;
			}
			num++;
		}
		System.out.println("5,7 최소공배수 :" + num);
		
		//continue
		int total = 0;
		int i = 1;
		while(i <= 10) {
			i++;
			
			if(i % 2 ==1 ) {
				continue;
			}
			total += i;
		}
		System.out.println("1-10 짝수합"+ total);
	}

}
