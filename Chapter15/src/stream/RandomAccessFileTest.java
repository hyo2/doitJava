package stream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {

		RandomAccessFile rf = new RandomAccessFile("random.txt","rw");
		rf.writeInt(100); // 4byte
		System.out.println(rf.getFilePointer()); // 쓰인 위치가 4
		rf.writeDouble(3.14); // 8
		System.out.println(rf.getFilePointer());
		rf.writeUTF("안녕하세요"); // 수정된 UTF 파일에서 한글 하나당 3byte 씀.
		// 3*5 + 2(맨 뒤에 들어간s null문자(스트링이니까 들어가는 것) = 17
		System.out.println(rf.getFilePointer());
		
		// 다시 첨부터 읽어야하니까 파일 포인터 옮겨줘야 함(지금 29임)
		rf.seek(0); // 맨 앞으로 간다.
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
		
	}

}
