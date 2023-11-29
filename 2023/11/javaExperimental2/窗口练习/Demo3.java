import javax.swing.*;
import java.awt.*;

public class Demo3 extends JFrame {

    public Demo3(){
        setLayout(new GridLayout(4,4,5,5));

        JButton jButton[]=new JButton[16];
        for (int i = 0; i < 16; i++) {
            jButton[i]=new JButton();
            jButton[i].setText("Button "+i);
        }
        JPanel jPanel[]=new JPanel[16];
        for (int i = 0; i < 16; i++) {
            jPanel[i]=new JPanel();
            jPanel[i].add(jButton[i]);
        }

        for (int i = 0; i < 16; i++) {
            add(jPanel[i]);
        }

        setVisible(true);
        setSize(600,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Demo3();
    }
}
