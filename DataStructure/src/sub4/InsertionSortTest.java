package sub4;

import java.util.Arrays;

/**
 * 25.7.8
 * 삽입정렬 알고리즘
 */

public class InsertionSortTest {
	public static void main(String[] args) {
		int[] arr = {4,2,1,5,3};
		for(int i =1 ; i<arr.length; i++) {
			int key = arr[i]; //기준값
			int j = i -1;
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = key;
			System.out.println(Arrays.toString(arr));
			
		}
	}

}
