package classex;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Person person = new Person();
		
		Class pClass1 = person.getClass();
		
		// 클래스의 풀네임(패키지명까지)을 가져오게 됨
		System.out.println(pClass1.getName()); 
		
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("classex.Person");
		System.out.println(pClass3.getName());
		
		Class pClass4 = Class.forName("java.lang.String");
		System.out.println(pClass4.getName());
		
		
		Class pClass = Class.forName("classex.Person");
		Person p = (Person)pClass.newInstance();
		System.out.println(person);
		System.out.println(p);
	}

}
