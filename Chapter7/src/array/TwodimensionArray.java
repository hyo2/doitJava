package array;

public class TwodimensionArray {

	public static void main(String[] args) {
		
		int[][] arr = new int[2][3];
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		
		int[][] arr2 = {{1,2,3}, {4,5,6}};
		
		// 증축된 for문
		for(int i = 0;i<arr2.length;i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j]);
			}
		}
		
		System.out.println("");
		
		char ch = 'a';
		// 알파벳 소문자 배열
		char[][] alphabets = new char[13][2];
		for(int i = 0; i<alphabets.length;i++) {
			for(int j = 0;j<alphabets[i].length;j++,ch++) {
				alphabets[i][j] = ch;
				System.out.print(alphabets[i][j]);
			}
		}
	}

}
