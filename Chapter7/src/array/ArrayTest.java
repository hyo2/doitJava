package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] numbers = new int[3];
		
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		
		for(int i = 0; i < numbers.length; i++) // 프밍에서 상수를 바로 쓰는 건 안 좋음->length 쓰기
		{
			System.out.println(numbers[i]);
		}
		
	}

}
