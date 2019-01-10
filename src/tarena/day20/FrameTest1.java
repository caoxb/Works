package tarena.day20;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrameTest1 {
    public static void main(String[] args) {
        test3();
    }

    private static void test3() {
        JFrame f = new JFrame();// 建窗口实例
        f.setTitle("标题栏文字");
        f.setSize(300, 200);// 宽度高度
        f.setLocation(400, 400);// 在屏幕上的位置
        f.setDefaultCloseOperation(// 关闭操作设置为退出虚拟机
                JFrame.EXIT_ON_CLOSE);

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();

        p1.add(new JButton("OK1"));
        p2.add(new JButton("OK2"));
        p2.add(new JButton("OK3"));

        p1.setBackground(Color.CYAN);
        p2.setBackground(Color.LIGHT_GRAY);

        f.getContentPane().add(p1, BorderLayout.NORTH);
        f.getContentPane().add(p2);


        f.setVisible(true);
    }


    private static void test2() {
        JFrame f = new JFrame();// 建窗口实例
        f.setTitle("标题栏文字");
        f.setSize(300, 200);// 宽度高度
        f.setLocation(400, 400);// 在屏幕上的位置
        f.setDefaultCloseOperation(// 关闭操作设置为退出虚拟机
                JFrame.EXIT_ON_CLOSE);

        // 建按钮实例
        JButton btn1 = new JButton("OK1");
        JButton btn2 = new JButton("OK2");
        JButton btn3 = new JButton("OK3");
        JButton btn4 = new JButton("OK4");
        JButton btn5 = new JButton("OK5");

        FlowLayout flayout = new FlowLayout();
        f.getContentPane().setLayout(flayout);

        //		GridLayout glayout =
        //				new GridLayout(2,3,5,10);
        //		f.getContentPane().setLayout(glayout);

        JTextField text = new JTextField(20);
        text.setHorizontalAlignment(JTextField.RIGHT);

        // 取得窗口中的内容面板，
        // 将按钮放入内容面板
        f.getContentPane().add(text);
        f.getContentPane().add(btn1, BorderLayout.NORTH);
        f.getContentPane().add(btn2, BorderLayout.EAST);
        f.getContentPane().add(btn3, BorderLayout.SOUTH);
        f.getContentPane().add(btn4, BorderLayout.WEST);
        f.getContentPane().add(btn5, BorderLayout.CENTER);


        // 设置为可见，系统会在屏幕上绘制窗口
        f.setVisible(true);
    }

    private static void test1() {
        JFrame f = new JFrame();// 建窗口实例
        f.setTitle("标题栏文字");
        f.setSize(300, 200);// 宽度高度
        f.setLocation(400, 400);// 在屏幕上的位置
        f.setDefaultCloseOperation(// 关闭操作设置为退出虚拟机
                JFrame.EXIT_ON_CLOSE);
        // 设置为可见，系统会在屏幕上绘制窗口
        f.setVisible(true);
    }
}







