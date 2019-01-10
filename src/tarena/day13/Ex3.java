package tarena.day13;

import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 算式运算
public class Ex3 {
    public static void main(String[] args) {
        double d = jiSuan("1+2/(((3-4)*2)-5)");
        System.out.println(d);
    }

    public static double jiSuan(String formula) {
        FormulaParser p = new FormulaParser(formula);
        LinkedList<Double> list1 = new LinkedList<Double>();
        LinkedList<String> list2 = new LinkedList<String>();
        while (p.hasNext()) {
            String s = p.next();
            System.out.println(s);
            if (isNumber(s)) {
                list1.add(Double.parseDouble(s));
            } else if (isChengChu(s)) {
                String s2 = p.next();
                double d2;
                if (isNumber(s2)) {
                    d2 = Double.parseDouble(s2);
                } else {// 子算式
                    // 递归运算子算式，结果赋值给 d2
                    d2 = jiSuan(s2);
                }
                double d1 = list1.removeLast();
                double d3 = jiSuan(d1, s, d2);
                list1.add(d3);
            } else if (isJiaJian(s)) {
                list2.add(s);
            } else { // s 是子算式
                // 递归计算子算式
                // 计算结果放入 list1
                double d = jiSuan(s);
                list1.add(d);
            }
        }

        while (list2.size() != 0) {
            double d1 = list1.removeFirst();
            String s = list2.removeFirst();
            double d2 = list1.removeFirst();
            double d3 = jiSuan(d1, s, d2);
            list1.addFirst(d3);
        }

        return list1.removeFirst();
    }

    private static boolean isJiaJian(String s) {
        return s.matches("[\\+\\-]");
    }

    private static double jiSuan(double d1, String s, double d2) {
        if ("*".equals(s)) {
            return d1 * d2;
        } else if ("/".equals(s)) {
            return d1 / d2;
        } else if ("+".equals(s)) {
            return d1 + d2;
        } else {
            return d1 - d2;
        }
    }

    private static boolean isChengChu(String s) {
        return s.matches("[\\*/]");
    }

    private static boolean isNumber(String s) {
        return s.matches("\\d+(\\.\\d+)?");
    }

    static class FormulaParser {
        String formula; // 1.1+12-3.2*23/6
        int i = 0;           //         i
        String regex = "\\d+(\\.\\d+)?|[\\+\\-\\*/]";
        Matcher matcher;

        public FormulaParser(String formula) {
            this.formula = formula.replaceAll(" ", "");
            matcher =
                    Pattern.compile(regex)
                            .matcher(this.formula);
        }

        public boolean hasNext() {
            return i < formula.length();
        }

        public String next() {
            if (formula.charAt(i) == '(') {
                int j = youKuoHao();
                String zss = formula.substring(i + 1, j);
                i = j + 1;
                return zss;
            }

            matcher.find(i);
            String s = matcher.group();
            i = matcher.end();
            return s;
        }

        private int youKuoHao() {
            int c = 1;
            int j = i + 1;
            while (true) {
                if (formula.charAt(j) == '(') {
                    c++;
                } else if (formula.charAt(j) == ')') {
                    c--;
                    if (c == 0) {
                        return j;
                    }
                }
                j++;
            }
        }
    }
}
