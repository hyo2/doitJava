package chapter5;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = addNum(num1, num2);
		System.out.println(sum);
	}
	
	public static int addNum(int n1, int n2) {// 함수 선언하는 부분
		// 구현코드 = 함수를 정의한다.
		int result = n1 + n2; 
		return result;
	}

}
