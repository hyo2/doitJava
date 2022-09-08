package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class InArrayTest {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,};
		
		IntStream stream = Arrays.stream(arr); // 스트림 생성
		int sum = stream.sum();
		System.out.println(sum);
		
//		int count = (int) stream.count();
//		System.out.println(count); // 이미 이 stream이 쓰였기 때문에 전부 소모됨
	
		int count = (int) Arrays.stream(arr).count(); // 다시 쓰려면 다시 생성해야함
		System.out.println(count);
	}

}
