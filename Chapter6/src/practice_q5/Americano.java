package practice_q5;

public class Americano {
	int money; // 수입
	int customer; // 주문한 고객 수
	// String order; // 주문 음료
	
//	public Americano(String order) {
//		this.order = order;
//	}
	
	public void buy(int money) {
		this.money += money;
		customer++;
	}
	
	public void showInfo() {
		System.out.println("현재까지 아메리카노를 시킨 사람은 총 "+customer+"이고 수익은 "+money+"입니다.");
	}
}
