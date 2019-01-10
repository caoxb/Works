package tarena.day20;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

/*
 * 计算器窗口类
 */
public class CalculatorFrame extends JFrame {
    JTextField text = new JTextField();
    JButton[] btns = new JButton[16];
    JButton btnEqual = new JButton("=");

    public CalculatorFrame() {
        btnEqual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton btn = (JButton) e.getSource(); // 获得事件源，发生事件的组件对象
                long t = e.getWhen();// 事件发生的时间
                System.out.println(btn.getText());
                System.out.println(t);
            }
        });

        text.setHorizontalAlignment(JTextField.RIGHT);
        text.setFont(new Font("Courier New", 0, 32));
        getContentPane().add(text, BorderLayout.NORTH);
        getContentPane().add(btnEqual, BorderLayout.SOUTH);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));
        String[] arr = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "+/-", ".", "+"};


        ActionListener lis = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton btn = (JButton) e.getSource();
                String s = btn.getText();
                if (s.matches("\\d")) {
                    text.setText(text.getText() + s);
                } else if (s.equals(".")) {
                    if (!text.getText().contains(".")) {
                        text.setText(text.getText() + s);
                    }
                } else if (s.equals("+/-")) {
                } else {
                }
            }
        };

        for (int i = 0; i < arr.length; i++) {
            btns[i] = new JButton(arr[i]);
            panel.add(btns[i]);
            btns[i].addActionListener(lis);
        }
        getContentPane().add(panel);

        //
        setTitle("计算器");
        setSize(300, 300);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(300, 300);
    }

    public static void main(String[] args) throws Exception {
        //		LookAndFeelInfo[] feels =
        //				UIManager.getInstalledLookAndFeels();
        //		for (LookAndFeelInfo f : feels) {
        //			System.out.println(f.getClassName());
        //		}

        UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");

        CalculatorFrame f = new CalculatorFrame();
        f.setVisible(true);
    }


}









