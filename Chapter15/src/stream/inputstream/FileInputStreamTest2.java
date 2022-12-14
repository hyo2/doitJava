package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("input2.txt")){
			byte[] bs = new byte[10];
			int i;
			while( (i = fis.read(bs)) != -1) {
				
				// 전체를 출력
//				for(byte b: bs) { // 버퍼 통째로 출력->garbage 남아 있는 거도 같이 출력됨(마지막줄 qrst-그 전꺼는 덮어씌워짐)
//					System.out.print((char)b);
//				}
				
				// 읽은 개수만큼을 출력
				for(int j=0; j<i; j++) { // j가 읽은 것보다 작은 동안 bs[j]를 출력
					System.out.print((char)bs[j]);
				}
				System.out.println();
			}
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
