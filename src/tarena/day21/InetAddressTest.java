package tarena.day21;

import java.net.InetAddress;

public class InetAddressTest {
    public static void main(String[] args) throws Exception {
        test1();
    }

    private static void test1() throws Exception {
        InetAddress addr = InetAddress.getLocalHost();
        System.out.println(addr.getHostAddress());
        System.out.println(addr.getHostName());

        // 通过主机名称获取地址可能失败
        addr = InetAddress.getByName("pjy-005");
        System.out.println(addr.getHostAddress());
        System.out.println(addr.getHostName());

        //
        addr = InetAddress.getByName("192.168.188.41");
        System.out.println(addr.getHostAddress());
        System.out.println(addr.getHostName());

    }
}





