package cooperation;

public class Subway {
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	// 승객을 한 명 태웠을 때 호출되는 메서드
	public void take(int money) {
		passengerCount++;
		this.money += money;		
	}
	
	public void showInfo() {
		System.out.println("지하철 "+lineNumber + "번의 승객은"+passengerCount+"명이고, 수입은 "+money+"입니다.");
	}
}