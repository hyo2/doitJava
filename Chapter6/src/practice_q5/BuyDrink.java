package practice_q5;

//아침 출근길에 김 씨는 4000원을 내고 별다방에서 아메리카노를 사 마셨습니다. 
//이 씨는 콩다방에서 4500원을 내고 라테를 사 마셨습니다. 객체지향-객체 간 협력 이용

public class BuyDrink {

	public static void main(String[] args) {
		Customer Kim = new Customer("Kim", 10000);
		Customer Park = new Customer("Park", 5000);
		Customer Lee = new Customer("Lee", 50000);
		
		Americano americano = new Americano();
		Kim.buyAmericano(americano);
		Kim.showInfo();
		americano.showInfo();
		
		Park.buyAmericano(americano);
		Park.showInfo();
		americano.showInfo();
		
		Latte latte = new Latte();
		Lee.buyLatte(latte);
		Lee.showInfo();
		latte.showInfo();

	}

}
