package reference;

public class Circle {

	// 클래스 안에서 다른 클래스를 가져다 쓰는
	// 참조 변수형으로 가져다 쓰기 위해서 선언하고 생성
	Point point;
	int radius;
		
	public Circle() {
	point = new Point();
	}
}
