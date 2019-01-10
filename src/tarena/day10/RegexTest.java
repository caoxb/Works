package tarena.day10;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Regex - 正则表达式
public class RegexTest {
    public static void main(String[] args) {
        //		char c = '\u4e00'; // 19968
        //		System.out.println(c);
        //		System.out.println(++c);
        //		c = '\u9fa5'; // 40869
        //		System.out.println(c);
        //		System.out.println(++c);
        test8();
    }

    private static void test8() {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入：");
        String s = sc.nextLine();
        String regex = "\\d{3,}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find()) { // 寻找下一个匹配子串
            String n = m.group(); // 获得刚刚找到的子串
            int start = m.start();// 子串起始位置
            int end = m.end();// 子串结束位置（不含）
            System.out.println(
                    "[" + start + "," + end + ") - " + n);
        }
    }


    private static void test7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入：");
        String s = sc.nextLine();
        // sadf,asdf,asdf,asdf
        // qwer qwer qwer qwer
        // sdfg;sdfg;sdfg;sdfg
        //wert,,,wertwe,qwer;qw,,   ;,;    ,wert
        // [,; ]+
        String regex = "[,; ]+";
        String[] arr = s.split(regex);
        System.out.println(Arrays.toString(arr));
    }


    private static void test6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入：");
        String s = sc.nextLine();

        String regex = "(T|t)(M|m)(D|d)|薄.?熙.?来|薄.?谷.?开.?来";
        s = s.replaceAll(regex, "***");
        System.out.println(s);
    }


    private static void test5() {
        /*
         * [a-zA-Z\u4e00-\u9fa5]+
         * [a-zA-Z\\u4e00-\\u9fa5]+
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("输入用户名(英文字母、中文)：");
        String s = sc.nextLine();


        String regex = "[a-zA-Z\\u4e00-\\u9fa5]+";
        if (s.matches(regex)) {
            System.out.println("输入正确");
        } else {
            System.out.println("输入不正确");
        }
    }

    private static void test4() {
        /*
         * asdf.asdf.asdf.asdf@qwer.com
         * 435124@qwer.wert.wert.wert.com.cn
         *
         * (\w+\.)*\w+@\w+(\.\w+)*(\.com|\.cn|\.net|\.org|\.uk)
         * (\\w+\\.)*\\w+@\\w+(\\.\\w+)*(\\.com|\\.cn|\\.net|\\.org|\\.uk)
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("输入字email：");
        String s = sc.nextLine();

        String regex = "(\\w+\\.)*\\w+@\\w+(\\.\\w+)*(\\.com|\\.cn|\\.net|\\.org|\\.uk)";
        if (s.matches(regex)) {
            System.out.println("输入正确");
        } else {
            System.out.println("输入不正确");
        }
    }


    private static void test3() {
        /*
         * 15位
         * 18位, 末位允许 x 或 X
         * \d{15}|(\d{17}(\d|x|X))
         * \\d{15}|(\\d{17}(\\d|x|X))
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("输入字身份证号：");
        String s = sc.nextLine();

        String regex = "\\d{15}|(\\d{17}(\\d|x|X))";
        if (s.matches(regex)) {
            System.out.println("输入正确");
        } else {
            System.out.println("输入不正确");
        }
    }


    static void test2() {
        /*
         * 29623423
         * 2962342
         * (010)29623423
         * (0100)2962342
         * 010-29623420
         * 0100-2962342
         *
         * \(\)
         * \(\d{3,4}\)
         * \(\d{3,4}\)|
         * \(\d{3,4}\)|\d{3,4}
         * \(\d{3,4}\)|\d{3,4}\-
         * (\(\d{3,4}\)|\d{3,4}\-)?
         * (\(\d{3,4}\)|\d{3,4}\-)?\d{7,8}
         *
         * (\(\d{3,4}\)|\d{3,4}\-)?\d{7,8}
         *
         * (\\(\\d{3,4}\\)|\\d{3,4}\\-)?\\d{7,8}
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("输入字电话：");
        String s = sc.nextLine();

        String regex = "(\\(\\d{3,4}\\)|\\d{3,4}\\-)?\\d{7,8}";
        System.out.println(regex);
        if (s.matches(regex)) {
            System.out.println("输入正确");
        } else {
            System.out.println("输入不正确");
        }
    }


    static void test1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入字符串：");
        String s = sc.nextLine();

        String regex = "[a-z]+";
        if (s.matches(regex)) {
            System.out.println("输入正确");
        } else {
            System.out.println("输入不正确");
        }
    }
}
