package tarena.day12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        test1();
    }

    private static void test2() {
        HashMap map = new HashMap();
        map.put(6, "随便6");
        map.put(3, "随便3");
        map.put(5, "随便5");
        map.put(1, "随便1");
        map.put(8, "随便8");
        map.put(5, "随便5");
        map.put(4, "随便4");
        map.put(9, "随便9");
        map.put(2, "随便2");

        // 1. 遍历所有的键
        Set keys = map.keySet();
        Iterator it = keys.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            Object v = map.get(o);
            System.out.println(o + " - " + v);
        }
        // 2. 遍历所有的 Entry
        Set entrys = map.entrySet();
        it = entrys.iterator();
        while (it.hasNext()) {
            Entry e = (Entry) it.next();
            Object k = e.getKey();
            Object v = e.getValue();
            System.out.println(k + " - " + v);
        }
    }

    private static void test1() {
        TreeSet set = new TreeSet();
        set.add(234);
        set.add(2);
        set.add(45);
        set.add(76);
        set.add(58);
        set.add(58);
        set.add(58);
        set.add(58);
        set.add(58);
        //set.add(null); // 只有二叉树，不能放 null 值

        System.out.println(set);
    }
}
