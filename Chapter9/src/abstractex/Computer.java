package abstractex;

public abstract class Computer {
	
	public abstract void display(); // () 후 {}가 아닌 ;를 함=> 구현을 안 하겠다는 의미 => 메서드를 선언만 함
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
