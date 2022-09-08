package chapter4;

public class IfExample1 {

	public static void main(String[] args) {
		char gender = 'F';
		
		if(gender=='F') { //만약 gender가 'F'라면
			System.out.println("여성입니다.");
		}
		
		else { // 그렇지 않다면
			System.out.println("남성입니다.");
		}
	}

}
