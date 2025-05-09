import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class TravelCostGUI {
    static JFrame jGUI;
    static JTextField MileNum;
    static JTextField MPGNum;
    static JTextField GasPriceNum;
    static JTextField ParkingNum;
    static JTextField TollNum;
    static JLabel title;
    static JLabel Lone;
    static JLabel Ltwo;
    static JLabel Lthree;
    static JLabel Lfour;
    static JLabel Lfive;
    static JLabel message;
    static JPanel p1;
    //static JButton b1;
    //static JButton b2;
    static JMenuBar mb;
    static JMenu m;
    static JMenuItem m1;
    static JMenuItem m2;

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        jGUI = new JFrame();
        jGUI.setTitle("Travel Cost App ver 2.0");
        p1 = new JPanel();
        p1.setLayout(null);

        title = new JLabel("Travel Cost App");
        title.setFont(new Font("Comic Sans", Font.BOLD, 25));
        title.setForeground(new Color(255, 0, 0));

        Lone = new JLabel("Miles to Drive:");
        MileNum = new JTextField(15);

        Ltwo = new JLabel("Miles per Gallon:");
        MPGNum = new JTextField(15);

        Lthree = new JLabel("Gasoline Price:");
        GasPriceNum = new JTextField(15);

        Lfour = new JLabel("Parking Cost:");
        ParkingNum = new JTextField(15);

        Lfive = new JLabel("Tolls Cost:");
        TollNum = new JTextField(15);

        // extra credit: menu bar setup
        mb = new JMenuBar();
        m = new JMenu("Options");

        m1 = new JMenuItem("Calculate Cost");
        m2 = new JMenuItem("Clear Fields");

        m1.addActionListener(new implementation());
        m2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });

        m.add(m1);
        m.add(m2);
        mb.add(m);
        jGUI.setJMenuBar(mb);



//        b1 = new JButton("Calculate");
//        b1.addActionListener(new implementation());
//
//        b2 = new JButton("Clear");
//        b2.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                clearFields();
//            }
//        });

        message = new JLabel();
        message.setOpaque(true);
        message.setBackground(new Color(144, 238, 144)); // Light green
        message.setFont(new Font("Comic Sans", Font.BOLD, 14));
        message.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        // Positioning
        title.setBounds(70, 40, 220, 40);
        Lone.setBounds(50, 100, 120, 30);
        MileNum.setBounds(180, 100, 100, 30);
        Ltwo.setBounds(50, 150, 120, 30);
        MPGNum.setBounds(180, 150, 100, 30);
        Lthree.setBounds(50, 200, 120, 30);
        GasPriceNum.setBounds(180, 200, 100, 30);
        Lfour.setBounds(50, 250, 120, 30);
        ParkingNum.setBounds(180, 250, 100, 30);
        Lfive.setBounds(50, 300, 120, 30);
        TollNum.setBounds(180, 300, 100, 30);

//        b1.setBounds(50, 350, 100, 30);
//        b2.setBounds(180, 350, 100, 30);

        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setFont(new Font("Comic Sans", Font.BOLD, 14));
        resultLabel.setBounds(50, 400, 100, 30);
        message.setBounds(180, 400, 120, 30);

        // Adding components
        p1.add(title);
        p1.add(Lone);
        p1.add(MileNum);
        p1.add(Ltwo);
        p1.add(MPGNum);
        p1.add(Lthree);
        p1.add(GasPriceNum);
        p1.add(Lfour);
        p1.add(ParkingNum);
        p1.add(Lfive);
        p1.add(TollNum);
        /*
        p1.add(b1);
        p1.add(b2);
        */
        p1.add(resultLabel);
        p1.add(message);

        jGUI.add(p1);

        // car icon
        Image icon = Toolkit.getDefaultToolkit().getImage(TravelCostGUI.class.getResource("/car.jpeg"));
        System.out.println(TravelCostGUI.class.getResource("/car.jpeg"));
        jGUI.setIconImage(icon);

        jGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jGUI.setResizable(true);
        jGUI.setSize(400, 550);
        jGUI.setLocation(350, 100);
        jGUI.setVisible(true);
    }

    private static void clearFields() {
        MileNum.setText("");
        MPGNum.setText("");
        GasPriceNum.setText("");
        ParkingNum.setText("");
        TollNum.setText("");
        message.setText("");
    }

    public static class implementation implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double n1 = Double.parseDouble(MileNum.getText());
                double n2 = Double.parseDouble(MPGNum.getText());
                double n3 = Double.parseDouble(GasPriceNum.getText());
                double n4 = Double.parseDouble(ParkingNum.getText());
                double n5 = Double.parseDouble(TollNum.getText());

                TravelCost cost = new TravelCost(n1, n2, n3, n4, n5);
                cost.CalCost();

                DecimalFormat df = new DecimalFormat("###,###.##");
                message.setText(df.format(cost.getTotalCost()));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter valid numbers.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}