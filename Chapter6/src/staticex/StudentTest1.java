package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		Student studentJ = new Student();
		System.out.println(studentJ.studentID); // 10001
		
		Student studentT = new Student();
		System.out.println(studentT.studentID); // 10002
		
		// static 변수는 클래스 이름으로 참조
		System.out.println(Student.getSerialNum()); // 10002 같은 값을 공유하고 있다는 것을 알 수 있음
		System.out.println(Student.getSerialNum()); // 10002
	}

}
