package chapter4;

public class Practice4_Q3 {

	public static void main(String[] args) {
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				if(i>=j)
				{
					System.out.println(i+" X "+j+" = "+i*j);
				}
				else break;
			}
		}
		}

}
