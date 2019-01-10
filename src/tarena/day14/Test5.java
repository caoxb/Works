package tarena.day14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Test5 {
	public static void main(String[] args) {
		test1();
	}

	private static void test1() {
		List<String> list = new ArrayList<String>();
		Collections.addAll(list,
				"2000-6-5",
				"2000-1-12",
				"2000-11-3",
				"asdfasdf",
				"2000-3-9");

		Collections.sort(list, new Comparator<String>() {
			public int compare(String o1, String o2) {
				try {
					SimpleDateFormat f =
							new SimpleDateFormat(
									"yyyy-MM-dd");
					Date d1 = f.parse(o1);
					Date d2 = f.parse(o2);
					return d1.compareTo(d2);
				} catch(Exception e) {
					RuntimeException ex = // e包装为RuntimeException
							new RuntimeException(e);
					throw ex;
				}
			}
		});
		System.out.println(list);
	}
}
