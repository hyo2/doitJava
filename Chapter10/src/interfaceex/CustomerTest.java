package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		
		Buy buyer = customer;
		buyer.buy();
		
		Sell seller = customer;
		seller.sell();

		customer.order();
		// 자바는 모두 가상 메서드 방식임
		// 현재 대입된 인스턴스가 Customer임 
		// 따라서 Customer의 order가 불림
		buyer.order(); 
		seller.order();
	}

}
