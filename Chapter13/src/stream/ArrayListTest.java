package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream; 

public class ArrayListTest {

	public static void main(String[] args) {
		
		// List => ArrayList의 상위 인터페이스. ArrayList가 구현한 인터페이스. 따라서 List라고 써도 됨
		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("James");
		sList.add("Edward");
		
		Stream<String> stream = sList.stream();
		
		stream.forEach(s->System.out.println(s));
		
		// 이렇게도 쓸 수 있긴 함. 동일함
//		for(String s: sList) {
//			System.out.println(s);
//		}
		
		// sorted()까지는 중간연산자. forEach()는 최종연산자
		sList.stream().sorted().forEach(s->System.out.println(s));
		
	}

}
