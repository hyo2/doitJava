package bookshelf;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {
		shelf.add(title); // 뒤에 추가됨
	}

	@Override
	public String deQueue() {
		return shelf.remove(0); // 제일 앞에 요소 책 이름 반환
	}

	@Override
	public int getSize() {
		return getCount();
	}
	

}
