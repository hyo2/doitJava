package practice_q3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStream {

	public static void main(String[] args) {
		
		String str = new String();
		str = "지금까지 자바 정말 재미있게 공부했어요^^";
		
		try(FileOutputStream fos = new FileOutputStream("practice_a.txt");
				OutputStreamWriter osw = new OutputStreamWriter(fos)) { // ,txt파일 <-이거 안쓰고 바로 stream을 매개변수로 넣음
			
			osw.write(str);
			
		} catch (IOException e) {
			System.out.println(e);
		}
		
		System.out.println("end");
	}

}
