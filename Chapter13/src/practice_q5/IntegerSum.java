package practice_q5;

@FunctionalInterface
interface Calc {
	public int add(int num1, int num2);
}

public class IntegerSum {

	public static void main(String[] args) {
		
		Calc calc = (n1, n2) -> n1 + n2;
		System.out.println(calc.add(1,2));
	}

}
