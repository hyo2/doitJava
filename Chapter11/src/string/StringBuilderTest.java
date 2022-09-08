package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		String str1 = new String("java");
		
		System.out.println(System.identityHashCode(str1));
		
		StringBuilder buffer = new StringBuilder(str1);
		System.out.println(System.identityHashCode(buffer));
		
		// 이 부분 기억해두기->나중에 프로그램에서 쓸 일 종종 있음 
		buffer.append(" and");
		buffer.append(" android");
		System.out.println(System.identityHashCode(buffer));
		
		String str2 = buffer.toString();
		System.out.println(str2);
		
		Integer i = new Integer(100); // deprecated
		Integer intNum = 100; // 그냥 이렇게 쓰면 알아서 객체로 생성됨
	}

}
