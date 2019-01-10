package tarena.day03;

public class Ex5 {
    public static void main(String[] args) {
        System.out.println(2);

        waiceng:
        // 对循环命名
        for (int i = 3; i <= 1000; i++) {
            for (int j = 2; j < Math.sqrt(i) + 1; j++) {
                if (i % j == 0) {
                    // continue 继续下一次循环
                    // 在嵌套的循环中如果要continue或break外层循环
                    // 要对外层循环命名
                    continue waiceng;
                }
            }
            System.out.println(i);
        }
    }
}
