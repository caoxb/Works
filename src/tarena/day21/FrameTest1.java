package tarena.day21;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrameTest1 extends JFrame {
    MyPanel panel = new MyPanel();

    JTextField text = new JTextField(20);
    JButton btnStart = new JButton("开始");
    JButton btnStop = new JButton("停止");

    boolean flag = false;

    public FrameTest1() {
        btnStart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                go();
            }
        });
        btnStop.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                stop();
            }
        });

        panel.add(text);
        panel.add(btnStart);
        panel.add(btnStop);

        getContentPane().add(panel);
        setSize(300, 200);
    }

    void go() {
        if (flag) {
            return;
        }

        flag = true;

        new Thread() {
            public void run() {
                while (flag) {
                    String s = text.getText();
                    String s1 = s.substring(0, s.length() - 1);
                    String s2 = s.substring(s.length() - 1);
                    text.setText(s2 + s1);
                    System.out.println(s2 + s1);
                    try {
                        Thread.sleep(200);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }

    void stop() {
        flag = false;
    }


    public static void main(String[] args) {
        FrameTest1 f = new FrameTest1();
        f.setVisible(true);
    }


    class MyPanel extends JPanel {
        // 在屏幕上绘制自身
        // Graphics g - 当前组件的一只画笔
        protected void paintComponent(Graphics g) {
            // 绘制自身
            // 以相对路径的方式，加载src目录下一个图片文件
            // 并获得文件流
            super.paintComponent(g);
            try {
                InputStream in =
                        FrameTest1.class
                                .getResourceAsStream("/a.jpg");
                BufferedImage img = ImageIO.read(in);
                g.drawImage(img, 0, 0, null);
            } catch (Exception e) {
                e.printStackTrace();
            }
            g.drawLine(0, 0, 100, 100);
        }
    }

}












