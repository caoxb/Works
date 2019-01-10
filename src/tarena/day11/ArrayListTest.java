package tarena.day11;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {
	public static void main(String[] args) {
		test1();
	}

	private static void test1() {
		ArrayList list = new ArrayList();
		list.add("abc");
		list.add("def");
		list.add("wer");
		list.add("abc");
		list.add(null);
		list.add("def");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println(list.contains("abc"));
		System.out.println(list.contains("fff"));
		
		System.out.println(list.indexOf("def"));
		System.out.println(list.set(3, "fff"));
		System.out.println(list);
		
		System.out.println(list.remove(3));
		System.out.println(list);
		
		System.out.println(list.remove("asdf"));
		System.out.println(list);
		
		Object[] arr = list.toArray();
		System.out.println(Arrays.toString(arr));
		
		list.clear();
		System.out.println(list);
	}
}









