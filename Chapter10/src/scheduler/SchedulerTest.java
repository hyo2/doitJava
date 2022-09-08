package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		
		// R , L, P
		System.out.println("전화 상담 배분방식을 선택하세요. R, L, P");
		
		int ch = System.in.read(); // 한 캐릭터를 읽을 수 있음
		Scheduler scheduler = null; // 우선 null로 초기화
		
		// scheduler 타입은 하나인데 그때그때마다 다른 인스턴스가 대입될 수 있음
		if( ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		}
		
		else if(ch == 'L' || ch =='l') {
			scheduler = new LeastJob();
		}
		
		else if(ch == 'P' || ch =='p') {
			scheduler = new PriorityAllocation();
		}
		else {
			System.out.println("지원하지 않는 기능입니다.");
			return; // main 함수 자체를 빠져나오는 용도
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}
}
