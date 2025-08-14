package sub3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// 필터스트림
public class FilterStreamTest {
	public static void main(String[] args) {

		// 리스트 생성
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3);
		System.out.println(numbers);
		
		//중복 제거
		List<Integer> newNumbers =  numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(newNumbers);
		
		//3 이상 필터링
		List<Integer> numbers3 =  numbers
									.stream()
									.distinct()	//중복 x
									.filter(num -> {
										
										if(num > 3) {
											return false;
										}else {
											return true;
										}
									})
									.collect(Collectors.toList());
		System.out.println(numbers3);
		
		// 중복제거, 짝수 데이터 필터링, 내림차순 정렬
		List<Integer> members4 =  numbers.stream()
										.distinct()
										.filter(num -> num % 2!=0)
										.sorted(Collections.reverseOrder())
										.collect(Collectors.toList());
		
		System.out.println(members4);
		
	}

}
