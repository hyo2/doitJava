package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
//		Customer customerLee = new Customer(100010, "Lee");
//		int price = customerLee.calcPrice(10000);
//		System.out.println("지불금액은 "+price +"이고 "+customerLee.showCustomnerInfo());
//		
//		VIPCustomer customerKim = new VIPCustomer(100010, "Kim",100);
//		price = customerKim.calcPrice(10000);
//		System.out.println("지불금액은 "+price +"이고 "+customerKim.showCustomnerInfo());
	
		Customer customerWho = new VIPCustomer(100010, "Who", 100);
		int price = customerWho.calcPrice(10000);
		System.out.println("지불금액은 "+price +"이고 "+customerWho.showCustomnerInfo());
	
		Customer customerGold = new GoldCustomer(100070, "Tey");
	}

}
