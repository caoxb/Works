package tarena.day20;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

// 测试事件
public class EventTestFrame extends JFrame {
    JTextField text = new JTextField(16);
    JPanel panel = new JPanel();

    public EventTestFrame() {
        panel.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                panel.setBackground(Color.YELLOW);
            }

            public void mouseEntered(MouseEvent e) {
                panel.setBackground(Color.BLUE);
            }

            public void mouseClicked(MouseEvent e) {
                int b = e.getButton();// 获得鼠标按键
                int x = e.getX(); // 鼠标 x 坐标
                int y = e.getY(); // 鼠标 y 坐标
                text.setText(b + " --> " + x + "," + y);
            }
        });


        text.addKeyListener(new KeyAdapter() {
            // 监听有字符的按键
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                System.out.println(c);
            }

            public void keyReleased(KeyEvent e) {
                int code = e.getKeyCode();
                if (code == KeyEvent.VK_ENTER) {
                    String s = text.getText();
                    System.out.println(s);
                    text.setText("");
                }
            }
        });


        panel.add(text);
        panel.setBackground(Color.YELLOW);
        getContentPane().add(panel);

        setTitle("测试事件");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 200);
    }

    public static void main(String[] args) {
        EventTestFrame f = new EventTestFrame();
        f.setVisible(true);
    }

}








