package tarena.day14;

// 汉诺塔
public class Ex3 {
    public static void main(String[] args) {
        // 三层汉诺塔，从A经过B移动到C
        hnt(64, "A", "B", "C");
    }

    public static void hnt(int n, String z1, String z2, String z3) {
        if (n == 1) {
            System.out.println(z1 + " -> " + z3);
            return;
        }
        hnt(n - 1, z1, z3, z2);
        System.out.println(z1 + " -> " + z3);
        hnt(n - 1, z2, z1, z3);
    }
}
