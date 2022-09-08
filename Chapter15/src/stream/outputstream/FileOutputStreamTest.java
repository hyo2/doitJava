package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) {

		byte[] bs = new byte[26];
		byte data = 65;
		for(int i = 0; i < bs.length; i++) {
			bs[i] = data++;
		}
		
		try(FileOutputStream fos = new FileOutputStream("output2.txt")){
//			fos.write(65);
//			fos.write(66);
//			fos.write(67);
			
			// 숫자가 문자로 바뀌어서 쓰임
			fos.write(bs,2,10); // buffer의 2번째부터 10개만 써라
			
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("end");
	}

}
