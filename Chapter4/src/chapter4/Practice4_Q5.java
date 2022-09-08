package chapter4;

public class Practice4_Q5 {

	public static void main(String[] args) {
		
		// Q4
		for(int i = 1; i <= 6; i++) {
			
			for(int k = 7; k>=i; k--) {
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++) {
				if(i % 2 == 1){
					System.out.print("*");
				}	
				System.out.print(" ");
			}
			System.out.print("\n");
			
		}
		
		// ~Q5
		for(int i = 1; i <= 7; i++) {
			
			
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int k = 7; k>=i; k--) {
				if(i % 2 == 1) {
					System.out.print("*");
				}
				System.out.print(" ");
			}
			System.out.print("\n");
			
		}
	}

}
