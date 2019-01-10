package tarena.day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// Generic
public class GenericTest {
    public static void main(String[] args) {
        test1();
    }

    private static void test2() {
        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(23, "232323");
        map.put(234, "234234");
        map.put(6, "666666");
        map.put(45, "45454545");
        map.put(2, "222222");

        String s = map.get(45);
        System.out.println(s);

        Set<Entry<Integer, String>> set = map.entrySet();
        Iterator<Entry<Integer, String>> it = set.iterator();
        while (it.hasNext()) {
            Entry<Integer, String> e = it.next();
            Integer k = e.getKey();
            String v = e.getValue();
            System.out.println(k + " - " + v);
        }

        //
        for (Entry<Integer, String> e : set) {
            Integer k = e.getKey();
            String v = e.getValue();
            System.out.println(k + " - " + v);
        }
    }

    private static void test1() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("asdf");
        list.add("rrr");
        list.add(null);

        String s = list.get(0);
        System.out.println(s);

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            s = it.next();
            System.out.println(s);
        }

        // 依次取出 list 中的元素，赋值给变量 s2
        for (String s2 : list) {
            System.out.println(s2);
        }
    }
}
