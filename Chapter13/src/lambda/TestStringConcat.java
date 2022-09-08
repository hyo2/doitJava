package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		// 기존 방법
		StringConcatImpl sImpl = new StringConcatImpl();
		sImpl.makeString("hello", "java");
		
		// 람다식 방법
		// 인터페이스형 변수에 람다식 대입
		StringConcat concat = (s1,s2)->System.out.println(s1 +" "+s2);
		concat.makeString("hello", "java");
		
		// 위의 람다식으로 구현하면 내부적으로 이런 구현부가 생기는 것임(익명 클래스)
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + " " + s2);
			}
		};
		
		concat2.makeString("hello","java");
	}
	
}
