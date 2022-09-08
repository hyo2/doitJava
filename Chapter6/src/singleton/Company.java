package singleton;

public class Company {

	// Company 내부에서만 생성해둘거임
	// 얘가 바로 이 전체에서 유일하게 사용될 instance
	// Null이 되거나 함부로 수정되면 안되기 때문에 private, 하나만 있을거기 때문에 static
	private static Company instance = new Company(); 
	private Company(){}; // 외부에서 이 생성자에 접근하지 못하게 하겠다.
						// -> 그럼 어디다가 생성하냐? ->윗줄참고(클래스 내부에 생성한다~)
	
	public static Company getInstance() { // 객체를 생성하지 않고 메서드 호출할 수 있는 방법 => static 사용
		if(instance == null)
			instance = new Company(); // null을 리턴해줄 수 없으니까 null인 경우에는 하나를 생성해서 대입해주기
		return instance; // 생성된 instance 객체를 외부에서 가져다가 쓸 수 있음
	}
	
}
