package sub3;

import java.util.Arrays;

/**
 * 25.7.8
 * 선택정렬 알고리즘
 */

public class SeletionSortTest {
	public static void main(String[] args) {
		int arr[] = {4,2,1,5,3};
		for(int i=0; i< 4;i++) {
			for(int j = i+1; j<5; j++) {
				if(arr[i] > arr[j]){
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		
		for(int n : arr) {
			System.out.print(n+"");
		}
	}

}
