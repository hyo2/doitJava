package lambda;

public class TestMyNumber {

	public static void main(String[] args) {
		
		MyNumber maxNum = (x,y) -> (x >= y) ? x:y; // return이랑 중괄호 생략
		
		int max = maxNum.getMaxNumber(10, 20);
		System.out.println(max);
		
		int i = 100;
		MyNumber num = new MyNumber() {
			
			@Override
			public int getMaxNumber(int num1, int num2) {
				System.out.println(i); // 참조는 OK but 변경은 X
				return 0;
			}
		};
	}

}
