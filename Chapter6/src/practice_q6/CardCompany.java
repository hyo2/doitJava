package practice_q6;

public class CardCompany {
	private static CardCompany instance = new CardCompany(); // 유일하게 생성한 인스턴스
	private CardCompany() {}
	
	public static CardCompany getInstance() {
		if(instance == null) {
			instance = new CardCompany();
		}
		return instance;
	}
	
	public Card creatCard() {
		Card card = new Card();
		return card;
	}
}
