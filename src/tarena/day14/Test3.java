package tarena.day14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        try {
            test1();
        } catch (ParseException e) {
            System.out.println("生日格式不对");
        }
    }

    private static void test1() throws ParseException {
        System.out.print(
                "输入生日（yyyy-MM-dd）：");
        String s = new Scanner(System.in).nextLine();
        SimpleDateFormat f =
                new SimpleDateFormat("yyyy-MM-dd");
        Date d = f.parse(s);
        long days =
                (System.currentTimeMillis() - d.getTime())
                        / 24 / 60 / 60 / 1000;
        System.out.println(
                "生存天数：" + days);
    }
}







