package tarena.day12;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        LinkedList list = new LinkedList();
        list.add("abc");
        list.add("def");
        list.add("ghi");

        list.addFirst(null);
        list.addLast("---");
        System.out.println(list);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println(list);

        list.offer("aaa");
        System.out.println(list);

        System.out.println(list.peek());
        System.out.println(list.poll());
        System.out.println(list);

        list.push("kkk");
        System.out.println(list);
        System.out.println(list.pop());
        System.out.println(list);

        // LinkedList 低效遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // LinkedList 高效遍历
        // iterator() 方法内会新建一个 迭代器 对象并返回
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            System.out.println(o);
            //list.remove(0); // 不能直接使用list来增删数据
            // 允许移除刚刚取出的数据
            if ("aaa".equals(o)) {
                it.remove(); // 迭代器的 remove() 方法
            }
        }

        System.out.println(list);
    }
}
