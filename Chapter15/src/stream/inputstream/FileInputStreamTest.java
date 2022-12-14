package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {
		
		FileInputStream fis = null; // try 구문에 넣으면 try 안에서만 보이는 변수임(finally에서도 써야 하는데 안보이게 됨)
		int i = 0;
		try {
			fis = new FileInputStream("input.txt");
			while( (i = fis.read()) != -1) { // 끝까지 읽기
				
				System.out.print((char)i);
			}
		
//		System.out.print((char)fis.read());
//		System.out.print((char)fis.read());
//		System.out.print((char)fis.read());
		}catch(IOException e) {
			System.out.println(e);
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e);
			} catch(NullPointerException e) { // 이거 안쓰면 nullpoint 에러는 못잡고 서비스 죽음(파일 없어서)
				System.out.println(e);
			}
		}
		System.out.println("end");
		
	}
}

