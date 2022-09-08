package practice;

public class q2_alphabet {

	public static void main(String[] args) {
		char[] alphabets = new char[26];
		char ch = 'a';
		
		for(char c : alphabets) {
			c = ch;
			System.out.println(c+", "+(int)c);
			ch++;
		}
	}
}
