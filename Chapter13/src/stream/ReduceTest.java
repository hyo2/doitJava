package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		// 제일 긴 String
		if(s1.getBytes().length <= s2.getBytes().length)
		return s1;

		else return s2;
	}		
}
	

public class ReduceTest {

	public static void main(String[] args) {

		String[] greetings = {"안녕하세요!!!", "hello", "Good morning","반갑습니다."};
		
		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2)->{
			// 제일 긴 String
			if(s1.getBytes().length >= s2.getBytes().length)
				return s1;
		
			else return s2;
		}));
		
		// 이 코드의 apply 부분이 호출되면서 apply의 구현부가 실행됨
		// 밑위수? 미지수?에 BinaryOperator 구현부를 바로 쓸 때는 초기값 넣으면 X
		// get() -> 출력 반환 됨
		
		// 제일 짧은 String
		String str =  Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);
	}
}
