package tarena.day20;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Reflect - 反射
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        test4();
    }

    private static void test4() throws Exception {
        while (true) {
            System.out.println("输入类名：");
            String s = new Scanner(System.in).nextLine();
            Class c = Class.forName(s);
            Object o = c.newInstance();

            showMethods(c);
            System.out.println("输入方法名：");
            String mName = // 无参方法或接收String的方法
                    new Scanner(System.in).nextLine();

            Method m = null;
            try {
                m = c.getMethod(mName);
                m.invoke(o);
            } catch (NoSuchMethodException e) {
                m = c.getMethod(mName, String.class);
                System.out.println("输入参数值：");
                String param = new Scanner(System.in).nextLine();
                m.invoke(o, param);
            }

        }
    }


    private static void test3() throws Exception {
        while (true) {
            System.out.println("输入类名：");
            String s = new Scanner(System.in).nextLine();
            Class c = Class.forName(s);
            Object o = c.newInstance();

            // 存取一个 int 类型的成员变量
            showFileds(c);

            System.out.println("输入变量名：");
            String fName = new Scanner(System.in).nextLine();

            Field f = c.getDeclaredField(fName);
            f.setAccessible(true);// 私有成员设置为可访问
            f.set(o, 99);// 为实例o的成员变量赋值
            System.out.println(f.get(o));// 获取实例o的成员变量值
        }
    }


    private static void test2() throws Exception {
        while (true) {
            System.out.println("输入类名：");
            String s = new Scanner(System.in).nextLine();
            Class c = Class.forName(s);

            // 无参构造
            try {
                Object o1 = c.newInstance();
                System.out.println(o1);
            } catch (Exception e) {
                System.out.println("无参的构造方法不存在");
            }
            // 有参构造，接收一个字符串的构造方法
            try {
                Constructor cons = c.getConstructor(String.class);
                Object o2 = cons.newInstance("dd");
                System.out.println(o2);
            } catch (Exception e) {
                System.out.println("接收String的构造方法不存在");
            }

        }
    }


    private static void test1() throws Exception {
        while (true) {
            System.out.println("输入类名：");
            String s = new Scanner(System.in).nextLine();
            Class c = Class.forName(s);

            System.out.println(c.getName());// 完整类名
            System.out.println(c.getPackage());// 包名
            System.out.println(c.getSimpleName());// 类名（不含包名）

            showFileds(c);
            showConstructors(c);
            showMethods(c);
        }
    }

    private static void showMethods(Class c) {
        System.out.println(
                "------------- 方法 -----------------");
        Method[] methods = c.getMethods();
        // public static String a(String n, int i) throws A,B
        for (Method method : methods) {
            String m = // 修饰符
                    Modifier.toString(method.getModifiers());
            Class rType = method.getReturnType();
            String name = // 名称
                    method.getName();
            Class[] params = // 参数类型
                    method.getParameterTypes();
            Class[] excep = // 异常类型
                    method.getExceptionTypes();
            System.out.println(
                    m + " " +
                            rType.getName() + " " +
                            name + "(" +
                            Arrays.toString(params) + ") throws " +
                            Arrays.toString(excep)
            );
        }
    }

    private static void showConstructors(Class c) {
        System.out.println(
                "------------- 构造方法 -----------------");
        Constructor[] arr =
                c.getDeclaredConstructors();
        // public Xxxxx(String n, int i) throws A,B
        for (Constructor cons : arr) {
            String m = // 修饰符
                    Modifier.toString(cons.getModifiers());
            String name = // 名称
                    cons.getName();
            Class[] params = // 参数类型
                    cons.getParameterTypes();
            Class[] excep = // 异常类型
                    cons.getExceptionTypes();

            System.out.println(
                    m + " " + name + "(" +
                            Arrays.toString(params) + ") throws " +
                            Arrays.toString(excep)
            );
        }
    }


    private static void showFileds(Class c) {
        System.out.println("------------- 成员变量 -----------------");
        // Field 类型对象中包含一个成员变量的全部信息
        // private static final Student a = 345;
        Field[] fields = c.getDeclaredFields();
        for (Field f : fields) {
            // 获得修饰符
            String m = Modifier.toString(f.getModifiers()); // 成员变量修饰符
            // 获得成员变量的类型
            Class type = f.getType();
            // 获得成员变量名
            String name = f.getName();

            System.out.println(
                    m + " " +
                            type.getSimpleName() + " " +
                            name);
        }
        /*
         * java.lang.String
         * java.lang.Integer
         * java.util.ArrayList
         * java.util.HashMap
         * java.text.SimpleDateFormat
         * java.util.Date
         * java.math.BigDecimal
         * java.math.BigInteger
         * tarena.day17.Student
         * tarena.day07.Point
         */
    }

    private static void test1(Object obj) throws Exception {
        Class c1 = ArrayList.class;
        Class c2 = Class.forName("java.util.ArrayList");
        Class c3 = obj.getClass();
        System.out.println(c1 == c2);
        System.out.println(c1 == c3);
    }
}	
