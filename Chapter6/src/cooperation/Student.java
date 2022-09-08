package cooperation;

public class Student {
	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	// 객체의 협업: 버스라는 객체를 받아서 버스 객체의 메서드를 호출함으로써 이쪽의 객체에 영향을 줌
	// 메서드: 버스를 탄다
	public void takeBus(Bus bus) { // bus의 정보를 매개변수로 받음
		bus.take(1000); 
		money -= 1000;
	}
	
	public void takeSubway(Subway subway) { // 생성된 인스턴스가 매개변수로 들어와야 함
		subway.take(1500); 
		money -= 1500;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money +"입니다.");
	}
}
