package chapter2;

public class ImplicitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte bNum = 10;
		int num = bNum;
		
		System.out.println(num);
		
		long lNum = 10; // 이런 경우에도 자연스럽게 형변환이 이루어진것임(리터럴인 10은 4byte(int). 근데 long은 8byte라서)
		float fNum = lNum;
		
		System.out.println(fNum);
		
		double dNum = fNum + num;
		// num이 float형으로 자연스럽게 형변환 이루어짐
		// 더해진 값이 dNum에 대입될 때, 더해진 값들이 double로 형변환됨
		System.out.println(dNum);
	}

}
