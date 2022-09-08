package singleton;
import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company c1 = Company.getInstance();
		Company c2 = Company.getInstance();
		
		System.out.println(c1);
		System.out.println(c2); // 둘이 같은 값 나옴=같은 인스턴스를 가리킨다.
		
		Calendar cal = Calendar.getInstance();
	}
}
