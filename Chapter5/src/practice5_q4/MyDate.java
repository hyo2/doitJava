package practice5_q4;

class MyDate {
	private int day;
	private int month;
	private int year;
	
	MyDate(int day, int month, int year) {
		setDay(day);
		setMonth(month);
		setYear(year);
	}
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public boolean isValid() { 
		boolean result;
		
		switch(month) {
		
		case 1: case 3: case 4: case 5: case 7: case 8: case 10: case 12:
			if(day<1 || day>31) {
				result = false;
			}
		
			else{
				result = true;
			}
			break;
			
		case 2: // 윤년 계산 하기
			if((year%4 == 0 && year % 100 != 0) || (year% 400 == 0)) {
				if(day<1 || day>29) {
					result = false;
				}
			
				else{
					result = true;
				}
			}
			
			else {
				if(day<1 || day>28) {
					result = false;
				}
			
				else{
					result = true;
				}
			}
			
			break;
			
		default:
			if(day<1 || day>30) {
				result = false;
			}
		
			else{
				result = true;
			}	
			break;
		}
		
		if(result == false) {
			System.out.println("유효하지 않은 날짜입니다.");
		}
		else {
			System.out.println("유효한 날짜입니다.");
		}
		return result;
	}
	
}
