package sorting;

public class HeapSort implements Sort {
	
	@Override
	public void ascedning(int[] number) {
		System.out.println("HeapSort ascending");
	}

	@Override
	public void descending(int[] number) {
		System.out.println("HeapSort descending");
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("It's HeapSort");
	}
	
}
