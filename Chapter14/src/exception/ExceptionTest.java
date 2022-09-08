package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("a.txt")) {
		
		} catch (IOException e) { // try-with-resource문으로 바꾸면 FileNotFoundException가 아니라 IOException을 써줘야함
			System.out.println(e);
		} //finally {
//			try {
//				fis.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println("finally");
//		}
		System.out.println("end");
	}

}
