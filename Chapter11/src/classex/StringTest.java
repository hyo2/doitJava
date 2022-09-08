package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class strClass = Class.forName("java.lang.String");
		
		Constructor[] cons = strClass.getConstructors();
		
		// Constructor 정보 구하기
		for(Constructor c : cons) {
			System.out.println(c);
		}
		
		// Constructor 정보 중에 내가 쓸 Constructor를 결정해서 그거로 객체 생성할 수 있음
		// => 이것이 reflection 프로그래밍
		
		
		Field[] fields = strClass.getFields();
		for(Field f : fields) {
			System.out.println(f);
		}
		
		Method[] methods = strClass.getMethods();
		for(Method m: methods) {
			System.out.println(m);
		}
	}

}
