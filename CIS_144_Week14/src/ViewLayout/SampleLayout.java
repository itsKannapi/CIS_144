package ViewLayout;
import java.awt.*;
import javax.swing.*;

public class SampleLayout {
    static JFrame f;
    static JPanel p1;
    static JPanel p2;
    static JButton b1;
    static JButton b2;
    static JButton b3;
    static JButton b4;
    static JButton b5;
    static JButton b6;

    public SampleLayout(){
        f = new JFrame("Grid Layout Sample");
        p1 = new JPanel();
        p2 = new JPanel();
        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        b4 = new JButton("Button 4");
        b5 = new JButton("Button 5");
        b6 = new JButton("Button 6");
        //p1.setLayout(new FlowLayout());
        p1.setLayout(new BorderLayout());
        p2.setLayout(new FlowLayout());
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        //adding
        p1.add(b1, BorderLayout.NORTH);
        p1.add(p2, BorderLayout.SOUTH);
//        p1.add(b3, BorderLayout.CENTER);
//        p1.add(b4, BorderLayout.EAST);
//        p1.add(b5, BorderLayout.SOUTH);
//        p1.add(b1);
//        p1.add(b2);
//        p1.add(b3);
//        p1.add(b4);
//        p1.add(b5);
        f.add(p1);


        //
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //f.setSize(400, 100);
        f.setSize(500, 200);
        f.setResizable(true);
        f.setVisible(true);
    }
}
