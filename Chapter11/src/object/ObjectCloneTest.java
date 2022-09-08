package object;

class Point{
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x = " + x +", "+"y = "+y;
	}
}

class Circle implements Cloneable {
	
	Point point;
	private int radius;
	
	public Circle(int x, int y, int radius) {
		point = new Point(x,y);
		this.radius = radius;
	}
	
	public String toString() {
		return "원점은 " + this.point+"이고, 반지름은 "+ radius +"입니다.";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}

public class ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Circle circle = new Circle(10, 20, 5);
		Circle cloneCircle = (Circle)circle.clone(); // 반환형이 object이므로 강제로 다운캐스팅
		
		// 복제가 잘 되어서 서로 다른 해시코드 값 나옴
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(cloneCircle));
		
		// 똑같은 인스턴스 멤버변수 값을 가진 인스턴스가 생성됐다는 것을 알 수 있음
		System.out.println(circle);
		System.out.println(cloneCircle);
	}

}
