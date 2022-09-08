package thisex;

class Birthday{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
		// 만약 this 빼면 year는 int year<-파라미터를 참조하게 되는 것임
		// => 내 목적은 멤버변수인 year에 넣는 것인데, 그냥 지역변수에 대입되는 것임
		// 뒤에 year도 int year 파라미터 참조함
		
		// 만약 int y였으면 year = y 해도 상관X
	}
	
	public void printThis() {
		System.out.println(this);
	}
}

public class ThisExample {
	
	public static void main(String[] args) {
		Birthday b1 = new Birthday();
		Birthday b2 = new Birthday();
		
		System.out.println(b1);
		b1.printThis();
		
	}

}
