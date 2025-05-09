import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;

public class finalexam1 {
    //Interface Implementation
    static JFrame gust;
    static JPanel p1;
    static JLabel title;
    static JLabel l1;
    static JLabel l2;
    static JLabel l3;
    static JLabel message;
    static JTextField num1;
    static JTextField num2;
    static JTextField num3;
    static JButton b1;
    static JButton b2;
    static JButton b3;
    public static void main(String[] args) {
        gust=new JFrame("Travel Expense Calculator ver 1.0");
        p1=new JPanel();
        p1.setLayout(null);
        title=new JLabel("Travel Expense Calculator App");
        Font f1=new Font("Verdana", Font.BOLD, 25);
        title.setFont(f1);
        Color c=new Color(61, 56, 198);
        Color c2=new Color(255,255,255);
        title.setForeground(c);
        l1=new JLabel("Enter Miles to Drive: ");
        num1=new JTextField(15);
        //num1.setEditable(false);
        l2=new JLabel("Enter Gas Price     : ");
        num2=new JTextField(15);
        l3=new JLabel("Enter Miles/Per/Gal : ");
        num3=new JTextField(15);
        //
        b1=new JButton("Calc Gas Exp");
        b1.setBackground(c);
        b1.setForeground(c2);
        // Add actionListener in internal class
        b1.addActionListener(new CalcGasExpense());
        //
        b2=new JButton("Calc Total Exp");
        b2.setBackground(c);
        b2.setForeground(c2);
        // Add actioListener in internal class
        b2.addActionListener(new CalcTotalExpense());
        //
        b3=new JButton("Clear Form");
        b3.setBackground(c);
        b3.setForeground(c2);
        // add inline event handler
        b3.addActionListener(new ClearForm());
        //
        message=new JLabel("Result of calc here");
        //interface location
        title.setBounds(75, 40, 220, 40);
        l1.setBounds(50, 100, 120, 30);
        num1.setBounds(170, 100, 150, 30);
        l2.setBounds(50, 150, 120, 30);
        num2.setBounds(170, 150, 150, 30);
        l3.setBounds(50, 200, 120, 30);
        num3.setBounds(170, 200, 150, 30);

        b1.setBounds(10, 250, 120, 30);
        b2.setBounds(140, 250, 120, 30);
        b3.setBounds(270, 250, 100, 30);
        message.setBounds(120, 300, 300, 30);
        //Interface addition
        p1.add(title);
        p1.add(l1);
        p1.add(num1);
        p1.add(l2);
        p1.add(num2);
        p1.add(l3);
        p1.add(num3);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(message);
        gust.add(p1);
        // Frame showing
        gust.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gust.setResizable(true);
        gust.setSize(400, 420);
        gust.setLocation(350, 100);
        gust.setVisible(true);
    }
    public static class CalcGasExpense implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double n1 = Double.parseDouble(num1.getText());
            double n2 = Double.parseDouble(num2.getText());
            double n3 = Double.parseDouble(num3.getText());
            TravelExpense cost = new TravelExpense(n1, n2, n3);
            cost.CalcGasExp();

            DecimalFormat df = new DecimalFormat("###,###.##");
            message.setText(df.format(cost.getTotGasExpense()));
        }
    }
    public static class CalcTotalExpense implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double n1 = Double.parseDouble(num1.getText());
            double n2 = Double.parseDouble(num2.getText());
            double n3 = Double.parseDouble(num3.getText());
            TravelExpense cost = new TravelExpense(n1, n2, n3);
            cost.CalcGasExp();
            cost.CalcTotalExp();

            DecimalFormat df = new DecimalFormat("###,###.##");
            message.setText(df.format(cost.getTotTravelExp()));
        }
    }
    public static class ClearForm implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            num1.setText("");
            num2.setText("");
            num3.setText("");
            message.setText("");
        }
    }
}