package practice_q6;

// 카드 회사에서 카드를 발급할 때마다 카드 고유 번호를 부여해 줍니다.
// 카드가 생성될 때마다 카드 번호가 자동으로 증가할 수 있도록 카드 클래스를 만들고 생성해보세요.

public class Card {
	private static int serialNum = 1000;
	private int cardNumber;
	
	Card() {
		serialNum++;
		this.cardNumber = serialNum;
	}
	
	public int getCardNumber() {
		return cardNumber;
	}
	
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public void showNumber() {
		System.out.println("카드 번호: "+getCardNumber());
	}
}
