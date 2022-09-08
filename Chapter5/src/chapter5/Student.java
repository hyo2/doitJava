package chapter5;

public class Student {
	
	// 이클립스에서 코딩하면 멤버변수는 파랑색으로 주로 표현됨
	int studentID; // 변수는 소문자로 시작하는 경우 多. 
	String studentName; // String: JDK에서 제공되는, 문자열을 구현해놓은 클래스
	int grade;
	String address;
	
	
	// 기본 생성자
	public Student() {}
	
	// 매개변수가 있는 생성자
	public Student(int id, String name) { // 이 student가 생성될 때, 학생의 id와 이름을 전달받아서 사용하고 싶다.
		// 무조건 student가 생성될 때는 id랑 이름이 넘어와야 한다.
		// 당연히 멤버변수에 넣어줘야 힙 메모리에 들어감
		studentID = id;
		studentName = name;
		
		
	}
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) { // 외부에서 이름 바꾸고 싶을 때 씀
		studentName = name; // 바꿀 이름이 매개변수로 들어오는 거였음
	}
	
//	public static void main(String[] args) {
//		// 반드시 여기 위치할 필요X. 단순히 이 클래스를 돌리기 위해서 만드는 main 메소드
//		// main 함수가 있으면 이쪽으로 시작하는 것
//		// 이 main 함수는 Student의 메서드라고 하지 않음. 그냥 시작되는 함수임. 
		// jvm이 호출해주는 함수. 이 부분이 먼저 수행이 되도록 jvm이 호출해주는 것
//		
//		Student studentLee = new Student(); // 기본 생성자(default 생성자) -> heap 메모리에 생성됨
//		studentLee.studentName = "이순신";
//		studentLee.address = "서울시 서초구 서초동";
//		
//		studentLee.showStudentInfo();
//	}
}
