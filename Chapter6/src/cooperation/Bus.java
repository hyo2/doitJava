package cooperation;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) { // 버스는 무조건 버스번호가 있어야 함. 아니면 생성X
		this.busNumber = busNumber;
	}
	
	// 승객을 한 명 태웠을 때 호출되는 메서드
	public void take(int money) {
		passengerCount++;
		this.money += money;		
	}
	
	public void showInfo() {
		System.out.println("버스 "+busNumber + "번의 승객은"+passengerCount+"명이고, 수입은 "+money+"입니다.");
	}
}
