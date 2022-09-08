package exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		
		AutoCloseObj obj = new AutoCloseObj();
		try(obj){
			// AutoCloseObj가 생성되고 나서 예외를 그냥 하나 발생시키기
			throw new Exception(); // 예외 발생시키는 키워드: throw
		}catch(Exception e) { // 그냥 최상위 클래스 씀(Exception)
			System.out.println("exception");
		}
	}

}
