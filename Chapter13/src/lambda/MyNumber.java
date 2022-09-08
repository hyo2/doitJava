package lambda;

@FunctionalInterface
public interface MyNumber {

	int getMaxNumber(int num1, int num2);
//	int testNumber(int x, int y); // 람다식을 위한 함수형 인터페이스는 메서드 1개만 선언해야 함
}
