package chapter5;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(100, "이순신");
//		studentLee.studentName = "이순신";
//		studentLee.studentID = 100;
//		studentLee.address = "서울시 서초구 서초동";
		
		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.studentID = 101;
		studentKim.address = "미국 산호세";
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		
		System.out.println(studentLee);
	}

}
