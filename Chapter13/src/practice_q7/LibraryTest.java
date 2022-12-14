package practice_q7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Book{
	private String name;
	private int price;
	
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}

public class LibraryTest {

	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book("자바", 25000));
		bookList.add(new Book("파이썬", 15000));
		bookList.add(new Book("안드로이드", 30000));
		
		// Stream 생성
		Stream<Book> stream = bookList.stream();
		
		// 모든 책의 가격의 합
		int total = stream.mapToInt(n -> n.getPrice()).sum();
		System.out.println(total);
		
		// 책의 가격이 20000원 이상인 책의 이름을 정렬하여 출력
		bookList.stream().filter(n->n.getPrice() >=20000).map(n->n.getName()).sorted().forEach(n -> System.out.println(n));
		
	}

}
