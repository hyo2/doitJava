package innerclass;

class Outer{
	
	int outNum = 100;
	static int sNum = 200;
	
	// 익명 내부 클래스 - 변수에 대입해서 구현한 경우
	// 안드로이드에서 서비스 같은 거 하 때 쓰레드 만들 때 많이 씀
	// 외부에서 쓰레드 만들어서 돌릴 때도 많이 사용
	Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("runnable");
		}
	};
	
	public Runnable getRunnable(int i){
		
		int localNum = 100;
		
//		// 지역 내부 클래스
//		class MyRunnable implements Runnable{
//
//			@Override
//			public void run() {
//				
////				localNum += 100; // 값을 변경시킴
////				i += 200; // 값을 변경시킴
//				
//				outNum += 10;
//				
//				System.out.println(outNum);
//				System.out.println(sNum);
//				System.out.println(localNum); // 출력은 상관 X
//				System.out.println(i); // 출력은 상관 X
//			}
//		}
//		return new MyRunnable();
//	}
		
		// 익명 내부 클래스 - 메서드 내부에 구현한 경우
		return new Runnable() {

			@Override
			public void run() {
				outNum += 10;
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum); // 출력은 상관 X
				System.out.println(i); // 출력은 상관 X
			}
		};
	}
}

public class LocalInnerTest {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		Runnable runnable = outer.getRunnable(20); // getRunnable() 호출 끝남->localNum이랑 매개변수 없어짐
		runnable.run(); // getRunnable() 호출 끝난 후에 run() 호출함-이 시점에는 이미 매개변수랑 지역변수 사라져있음
		
		outer.runnable.run(); // outer가 이미 생성됐고 그 안에 runnable이란 객체가 있고 그 안의 run을 호출함
	}

}
