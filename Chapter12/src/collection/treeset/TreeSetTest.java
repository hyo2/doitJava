package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<String> tree = new TreeSet<String>();
		
		tree.add("aa");
		tree.add("cc");
		tree.add("bb");
		
		System.out.println(tree);
	}

}
