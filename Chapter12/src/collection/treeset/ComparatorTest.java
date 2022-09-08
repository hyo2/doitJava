package collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String str1, String str2) {
		// 내림차순
		return str1.compareTo(str2) * (-1);
	}
	
}

public class ComparatorTest {

	public static void main(String[] args) {
		
		// new MyCompare() 넣으면 Comparator 방식으로 비교하는 것
		TreeSet<String> tree = new TreeSet<String>(new MyCompare());
		
		tree.add("aa");
		tree.add("cc");
		tree.add("bb");
		
		System.out.println(tree);
	}

}
