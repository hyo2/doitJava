package stream.decorator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;


public class InputStreamReaderTest {

	public static void main(String[] args) {
		
		try(InputStreamReader irs = new InputStreamReader(System.in)){
			
			int i = 0;
			while((i = irs.read()) != -1 ) {
				System.out.print((char)i);
			}
		}catch(IOException e) {
			System.out.println(e);
		}
		
		Socket socket = new Socket();

		try {
			// getInputStream() 여기서는 한글만 읽을 수 있음(읽는게 바이트 타입/단위)
			// ->근데 InputStreamReader로 묶는 순간 문자로 변환해줌. character set에 맞게 묶어줌
			// InputStreamReader ir = new InputStreamReader(socket.getInputStream());
			
			// BufferedReader로도 쓸 수 있음. 문자로 바꾼거를 버퍼링을 해줌 - 보조 스트림 안에 또 다른 보조 스트림이 들어갈 수 있음
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			br.readLine(); // 한 줄을 읽어줌
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
}
