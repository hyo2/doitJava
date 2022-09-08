package practice;

public class q3_evenplus {

	public static void main(String[] args) {
		int[] evennum = new int[5];

			for(int j = 1; j <=10; j++) {
				if(j % 2 == 0) {
					evennum[(j-2)/2] = j;
					
				}
			}
		int sum = 0;
		
		
		
		for(int i = 0; i< evennum.length; i++) {
			System.out.print(evennum[i]+" ");
			sum += evennum[i];
		}
		System.out.println();
		System.out.println(sum);
		
	}

}
