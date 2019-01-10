package tarena.day21;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClientFrame extends JFrame {
    JTextArea textArea = new JTextArea();
    JTextField textField = new JTextField();
    JButton btnSend = new JButton("发送");

    PrintWriter out;

    public ChatClientFrame() {
        btnSend.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                send();
            }
        });
        textField.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    send();
                }
            }
        });


        JScrollPane scroll = new JScrollPane(textArea);

        getContentPane().add(scroll);
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(textField);
        panel.add(btnSend, BorderLayout.EAST);
        getContentPane().add(panel, BorderLayout.SOUTH);
        //
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(200, 200);
    }

    void connect() throws Exception {
        Socket s = new Socket("127.0.0.1", 8000);

        out =
                new PrintWriter(
                        new OutputStreamWriter(
                                s.getOutputStream()));
        final BufferedReader in =
                new BufferedReader(
                        new InputStreamReader(
                                s.getInputStream()));
        // 接收过程是阻塞的，必须启动线程
        new Thread() {
            public void run() {
                try {
                    String s;
                    while ((s = in.readLine()) != null) {
                        textArea.append(s);
                        textArea.append("\n");
                    }
                } catch (Exception e) {
                }
            }
        }.start();
    }

    void send() {
        String s = textField.getText();
        out.println(s);
        out.flush();
        textField.setText("");
    }

    public static void main(String[] args) throws Exception {
        ChatClientFrame f = new ChatClientFrame();
        f.setVisible(true);
        f.connect();
    }
}







