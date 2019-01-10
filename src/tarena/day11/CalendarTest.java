package tarena.day11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalendarTest {
    public static void main(String[] args) throws ParseException {
        test2();
    }

    private static void test2() throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入年月(yyyy-MM)：");
        String s = sc.nextLine();
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM");
        Date d = f.parse(s); //解析用户输入的年月, 1号，0:0:0
        Calendar c = Calendar.getInstance();
        c.setTime(d);// 让Calendar 也表示用户输入的时间

        // 确定 最大天数 和 1号是周几,
        // 周日用数字1表示......周六用数字6表示
        int max = c.getActualMaximum(Calendar.DAY_OF_MONTH);
        int day = c.get(Calendar.DAY_OF_WEEK);
        int space = day - 1; // 确定前面打印的空格数量

        System.out.println("日\t一\t二\t三\t四\t五\t六");
        int count = 0;// 用于计数，每7次打印补一个换行
        for (int i = 0; i < space; i++) {// 打印空格
            System.out.print(" \t");
            count++;
        }
        for (int i = 1; i <= max; i++) {// 打印1号到max号
            System.out.print(i + "\t");
            count++;
            if (count % 7 == 0) {// 每打印7次补一个换行
                System.out.println();
            }
        }
    }

    private static void test1() {
        Calendar c1 = Calendar.getInstance();
        System.out.println(c1.getTime());

        int year = c1.get(Calendar.YEAR);
        // 月: 0-11
        int month = c1.get(Calendar.MONTH);
        int date = c1.get(Calendar.DAY_OF_MONTH);
        System.out.println(year);
        System.out.println(month);
        System.out.println(date);

        //
        c1.set(Calendar.MONTH, -120);
        System.out.println(c1.getTime());
        c1.set(1999, 7, 20);//1999-8-20
        System.out.println(c1.getTime());
        c1.set(1999, 7, 20, 0, 0, 0);
        System.out.println(c1.getTime());
    }
}
