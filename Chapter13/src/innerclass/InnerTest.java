package innerclass;

class OutClass{
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	// 인스턴스 inner 클래스: 멤버변수와 동일한 위치에 선언되어 있음
	private class InClass{
		int inNum = 200;
		// static int sInNum = 100; //<-static 선언 불가
		
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
		}
	}
	
	public void usingInTest() {
		inClass.inTest();
	}
	
	// static inner 클래스: OutClass의 생성과 상관없이 생성해서 사용O
	static class InStaticClass{
		int iNum = 100;
		static int sInNum =200;
		
		void inTest() {
			//num += 10; // num은 OutClass의 인스턴스 변수임
			//근데 static 내부 클래스는 outclass와 무관화게 생성 가능
			//이말은 num이 생성 안 됐는데 메서드 호출될 수도 있는 상황인 것
			//따라서 static 내부 클래스는 OutClass의 인스턴스 변수 사용 불가
			
			sNum += 10; // 얘는 static 변수->사용 Ok!
			System.out.println(sNum);
			System.out.println(iNum);
			System.out.println(sInNum);
		}
		
		static void sTest() {
			System.out.println(sNum);
//			System.out.println(iNum); // 자기 클래스의 인스턴스 변수-> 사용 X
			System.out.println(sInNum);
		}
	}
}

public class InnerTest {

	public static void main(String[] args) {
		
		OutClass outClass = new OutClass();
//		outClass.inClass.inTest();
//		
//		OutClass.InClass inClass = outClass.new InClass();
//		inClass.inTest();
		
		outClass.usingInTest();
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		
		OutClass.InStaticClass.sTest();
		
		
	}

}
