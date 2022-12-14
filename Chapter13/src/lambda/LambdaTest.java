package lambda;

interface PrintString{
	void showString(String str);
}

public class LambdaTest {

	public static void main(String[] args) {
		
		// 변수처럼 사용
		PrintString lambdaPrint = str->System.out.println(str);
		lambdaPrint.showString("test");
		
		// 매개변수로 전달
		showMyString(lambdaPrint);
		
		// 메서드의 반환 값으로 반환
		PrintString reStr = returnPrint();
		reStr.showString("hello");
	}

	// main이 static 메서드이므로 static 함수로 만들어야 함
	// 구현부 전체가 매개변수로 들어온 거나 마찬가지
	// 내부 클래스가 생성됐다고 생각하면 lambdaPrint는 객체의 인스턴스 변수니까 당연히 넘어가는 것
	// 근데 함수형 프로그래밍 상태니까 마치 함수 자체가 매개변수로 들어간 것처럼 이해될 수 있음 
	private static void showMyString(PrintString lambda) {
		lambda.showString("test2");
	}
	
	public static PrintString returnPrint() {
		return s -> System.out.println(s + " world"); // 이 전체가 람다식
	}

}
