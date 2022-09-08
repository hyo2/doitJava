package scheduler;

public interface Scheduler {

	void getNextCall(); // 다음 고객의 콜을 가져옴
	void sendCallToAgent(); // 상담원에게 콜을 던짐
}
