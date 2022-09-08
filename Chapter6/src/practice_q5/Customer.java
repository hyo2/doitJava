package practice_q5;
// 아침 출근길에 김 씨는 4000원을 내고 별다방에서 아메리카노를 사 마셨습니다. 
// 이 씨는 콩다방에서 4500원을 내고 라테를 사 마셨습니다. 객체지향-객체 간 협력 이용

public class Customer {
	String customerName;
	int customerMoney;
	
	public Customer(String customerName, int customerMoney) {
		this.customerName = customerName;
		this.customerMoney = customerMoney;
	}
	
	public void buyAmericano(Americano americano){
		americano.buy(4000);
		this.customerMoney -= 4000;
	}
	
	public void buyLatte(Latte latte) {
		latte.buy(4500);
		this.customerMoney -= 4500;
	}
	
	public void showInfo() {
		System.out.println(customerName + "님의 현재 남은 금액은 "+customerMoney);
	}
}
