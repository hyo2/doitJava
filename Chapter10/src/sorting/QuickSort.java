package sorting;

public class QuickSort implements Sort {

	@Override
	public void ascedning(int[] number) {
		System.out.println("QuickSort ascending");
	}

	@Override
	public void descending(int[] number) {
		System.out.println("QuickSort descending");
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("It's QuickSort");
	}
}
