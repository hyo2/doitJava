package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
//		Customer customerLee = new Customer();
//		customerLee.setCustomerID(10010);
//		customerLee.setCustomerName("이순신");
//		customerLee.bonusPoint = 1000;
//		
//		System.out.println(customerLee.showCustomnerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(10101, "Kim", 100);
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 1000;
		
		System.out.println(customerKim.showCustomnerInfo());
	}

}
