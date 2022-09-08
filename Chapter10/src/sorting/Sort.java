package sorting;

public interface Sort {

	void ascedning(int[] number);
	void descending(int[] number);
	default void description() {
		System.out.println("It's Number Sorting Algorithm");
	};
}
