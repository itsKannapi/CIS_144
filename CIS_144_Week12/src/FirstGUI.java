import javax.swing.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class FirstGUI {
    static JFrame jGUI;
    static JTextField num1;
    static JTextField num2;
    static JLabel title;
    static JLabel Lone;
    static JLabel Ltwo;
    static JLabel message;
    static JPanel p1;
    static JButton b1;
    static JButton b2;
    public static void main(String[] args) {
        jGUI = new JFrame();
        jGUI.setTitle("My First GUI");
        p1 = new JPanel();
        p1.setLayout(null);
        title = new JLabel("Calculator App");
        Font f1 = new Font("Comic Sans", Font.BOLD, 25);
        title.setFont(f1);
        Color c = new Color(240,180,220);
        title.setForeground(c);
        Lone = new JLabel("Number 1: ");
        num1 = new JTextField(15);
        Ltwo = new JLabel("Number 2: ");
        num2 = new JTextField(15);
        b1 = new JButton("Addition");
        b1.addActionListener(new implementation());
        b2 = new JButton("Clear Form");
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1.setText("");
                num2.setText("");
            }
        });

        message = new JLabel();

        // Location
        title.setBounds(70, 40, 220, 40);
        Lone.setBounds(50, 100, 100, 30);
        num1.setBounds(120, 100, 100, 30);
        Ltwo.setBounds(50, 150, 100, 30);
        num2.setBounds(120, 150, 100, 30);
        b1.setBounds(50, 200, 100, 30);
        b2.setBounds(180, 200, 100, 30);
        message.setBounds(100,250,300,30);
        // Building
        p1.add(title);
        p1.add(Lone);
        p1.add(num1);
        p1.add(Ltwo);
        p1.add(num2);
        p1.add(b1);
        p1.add(b2);
        p1.add(message);
        jGUI.add(p1);
        Image icon = Toolkit.getDefaultToolkit().getImage(FirstGUI.class.getResource("/Calculator.png"));
        System.out.println(FirstGUI.class.getResource("/Calculator.png"));
        jGUI.setIconImage(icon);
        jGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jGUI.setResizable(true);
        jGUI.setSize(400, 400);
        jGUI.setLocation(350,100);
        jGUI.setVisible(true);
    }
    public static class implementation implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            double n1;
            double n2;
            double total;
            DecimalFormat df = new DecimalFormat("#,###.##");
            n1 = Double.parseDouble(num1.getText());
            n2 = Double.parseDouble(num2.getText());
            total = n1 + n2;
            message.setText("The total is: " + (df.format(total)));
        }
    }
}
