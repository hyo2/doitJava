package stream.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{ // Externalizable도 쓸 수 있음
	// 시리얼번호: 얘가 몇번의 객체다~ 
	// -> 객체가 많이 수정된 경우에는 versionID를 바꿀 수 있음
	// generate하면 알아서 automatic하게 생성해줌->나중에 필요하면 수정하면 됨
	private static final long serialVersionUID = -8979042624550852984L;

	String name;
	transient String title;
	
	public Person() {}
	public Person(String name, String title) {
		this.name = name;
		this.title = title;
	}
	
	public String toString() {
		return name + "," + title;
	}
//	@Override
//	public void writeExternal(ObjectOutput out) throws IOException {
//		
//	}
//	@Override
//	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
//		// TODO Auto-generated method stub
//		
//	}
}

public class SerializationTest {

	public static void main(String[] args) throws ClassNotFoundException {

		Person personLee = new Person("Lee", "Manager");
		try(FileOutputStream fos = new FileOutputStream("serial.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			oos.writeObject(personLee);
			
		}catch(IOException e) {
			System.out.println(e);
		}
		
		try(FileInputStream fis = new FileInputStream("serial.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			
			Object obj = ois.readObject();
			if( obj instanceof Person) { // Person이 아닐 수도 있기 때문에 Person인지 보기
				Person p = (Person)obj;
				System.out.println(p);
			}
			
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
