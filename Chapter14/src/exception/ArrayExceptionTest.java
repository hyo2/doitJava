package exception;

public class ArrayExceptionTest {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		try {
			for(int i = 0; i<=5; i++) {
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString()); // 그냥 e라고 입력해도 알아서 exception 객체의 toString()이 불림
			//return;
		}finally {
			System.out.println("finally");
		}
		
		
		System.out.println("end");
	}
}
