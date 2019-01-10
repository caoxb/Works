package tarena.day13;

import java.util.LinkedList;

public class Ex2 {
    public static long uglyNumber(int n) {
        LinkedList<Long> list3 = new LinkedList<Long>();
        LinkedList<Long> list5 = new LinkedList<Long>();
        LinkedList<Long> list7 = new LinkedList<Long>();
        list3.add(3L);
        list5.add(5L);
        list7.add(7L);
        long min = 0;
        for (int i = 0; i < n; i++) {
            long n3 = list3.getFirst();
            long n5 = list5.getFirst();
            long n7 = list7.getFirst();
            min = Math.min(n3, Math.min(n5, n7));
            if (min == n3) list3.removeFirst();
            if (min == n5) list5.removeFirst();
            if (min == n7) list7.removeFirst();
            list3.addLast(min * 3);
            list5.addLast(min * 5);
            list7.addLast(min * 7);
        }
        return min;
    }

    public static long ____uglyNumber(int n) {
        int count = 0;
        long i = 3;
        while (true) {
            long tmp = i;
            while (tmp % 3 == 0) {
                tmp = tmp / 3;
            }
            while (tmp % 5 == 0) {
                tmp = tmp / 5;
            }
            while (tmp % 7 == 0) {
                tmp = tmp / 7;
            }
            if (tmp == 1) {
                count++;
                if (count == n) {
                    return i;
                }
            }
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println(uglyNumber(1000));
    }
}
