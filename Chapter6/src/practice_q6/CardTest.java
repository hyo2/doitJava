package practice_q6;

public class CardTest {

	public static void main(String[] args) {
		
		CardCompany cardCompany = CardCompany.getInstance();
		
		Card card1 = cardCompany.creatCard();
		Card card2 = cardCompany.creatCard();
		
		card1.showNumber();
		card2.showNumber();
	}

}
