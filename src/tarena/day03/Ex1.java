package tarena.day03;

/*
 *
 **
 ***
 ****
 *****
 */
public class Ex1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // 5行
            for (int j = 1; j <= i; j++) { // 每行 i 个星号
                // print 末尾没有换行
                // println 末尾会有换行
                System.out.print("*");
            }
            // 打印完一行，添加换行符
            System.out.println();
        }
    }
}









