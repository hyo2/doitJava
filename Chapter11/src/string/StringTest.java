package string;

public class StringTest {

	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);
		
		String str3 = "abc";
		String str4 = "abc";
		System.out.println(str3 == str4);
		
		String string1 = new String("java");
		String string2 = new String("android");
		
		System.out.println(System.identityHashCode(string1));
		string1 = string1.concat(string2);
		
		System.out.println(string1);
		System.out.println(System.identityHashCode(string1));
	}
}
