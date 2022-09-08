package sorting;

public class BubbleSort implements Sort{
	
	@Override
	public void ascedning(int[] number) {
		System.out.println("BubbleSort ascending");
	}

	@Override
	public void descending(int[] number) {
		System.out.println("BubbleSort descending");
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("It's BubbleSort");
	}
	
}
