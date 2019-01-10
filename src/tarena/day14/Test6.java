package tarena.day14;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("用户名：");
        String usr = sc.nextLine();
        System.out.print("密　码：");
        String pwd = sc.nextLine();

        try {
            login(usr, pwd);
            System.out.println("欢迎回来，" + usr);
        } catch (UsernameNotFoundException e) {
            System.out.println("用户名不存在，请重试");
        } catch (WrongPasswordException e) {
            System.out.println("密码不正确，请重试");
        }
    }

    public static void login(String usr, String pwd)
            throws
            UsernameNotFoundException,
            WrongPasswordException {
        if (!"abc".equals(usr)) {
            throw new UsernameNotFoundException("username not found:" + usr);
        }

        if (!"aabbcc".equals(pwd)) {
            throw new WrongPasswordException("wrong password");
        }
    }
}
