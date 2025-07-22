package sub2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import sub1.Apple;

public class ListTest {public static void main(String[] args) {
	//aArrayList 기본
	List<Integer> list = new ArrayList();
	//데이터 삽입
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	list.add(1,6);
	System.out.println(list);
	//데이터 제거
	list.remove(2);
	System.out.println(list);
	list.remove(3);
	System.out.println(list);
	//데이터 출력
	System.out.println("list 1:"+list.get(0));
	System.out.println("list 2:"+list.get(1));
	System.out.println("list 3:"+list.get(2));
	//데이터 크기
	System.out.println("list 크기 "+list.size());
	//데이터 반복
	for(int num:list) {
		System.out.println("num: " + num);
	}
	//문자열 리스트 실습
	List<String> people = new ArrayList<String>();
	people.add("김유신");
	people.add("김춘추");
	people.add("장보고");
	people.add("강감찬");
	people.add("이순신");
	people.add("정약용");
	people.add(4, "이성계");
	people.add(1, "비담");
	people.remove(3);
	people.add(3, "왕건");
	people.set(5, "장도전");
	System.out.println(people);
	//객체 리스트
	Apple a1 = new Apple("한국",3000);
	Apple a2 = new Apple("한국",2000);
	List<Apple> apples = new ArrayList<Apple>();
	apples.add(a1);
	apples.add(a2);
	apples.add(new Apple("중국",1000));
	Apple koreaapple = apples.get(0);
	System.out.println(koreaapple);
	for(Apple apple : apples) {
		System.out.println(apple);
	}
	//linkedlist
	LinkedList<String> cities = new LinkedList<String>();
	cities.add("서울");
	cities.add("서울");
	cities.add("서울");
	cities.add("서울");
	cities.add("서울");
	System.out.println("cities" + cities);
}
}
