import javax.swing.*;
import java.awt.*;
import java.awt.Container;
import java.awt.BorderLayout;

public class BorderLayoutPosition extends JFrame {

    public BorderLayoutPosition(){
        setBounds(100,100,350,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        Container c = getContentPane();

        c.setLayout((LayoutManager) new BorderLayout());
        JButton b1 = new JButton("中");
        JButton b2 = new JButton("东");
        JButton b3 = new JButton("西");
        JButton b4 = new JButton("南");
        JButton b5 = new JButton("北");
        c.add(b1, BorderLayout.CENTER);
        c.add(b2,BorderLayout.EAST);
        c.add(b3,BorderLayout.WEST);
        c.add(b4,BorderLayout.SOUTH);
        c.add(b5,BorderLayout.NORTH);


    }

    public static void main(String[] args) {
        new BorderLayoutPosition();
    }
}
