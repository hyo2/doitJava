package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
		int iNum = 1000;
		byte bNum = (byte)iNum;
		
		// iNum의 값이 변하는 것은 아님
		// 대입이 될 때 바뀌어서 대입이 된다는 것
		System.out.println(iNum); // 1000
		System.out.println(bNum); //  -24
		//byte 데이터는 1byte(8bit)를 씀(256개의 데이터 표현)
		//-128~127까지 표현. 따라서 1000은 못들어감
		//4byte 중에 일부가 잘려서 1byte 값만 dNum에 넣음->그렇게 잘라서 넣다보니 음수가 됨(1)
		
		double dNum = 3.14;
		iNum = (int)dNum;
		System.out.println(iNum);
		float fNum = 0.9F;
		
		int num1 = (int)dNum + (int)fNum; // 3+0
		int num2 = (int)(dNum + fNum); // 3.14+0.9=>4
		
		System.out.println(num1);
		System.out.println(num2);
	}

}
