import javax.swing.*;
import java.awt.*;

public class AbsolutePosition extends JFrame {
    public AbsolutePosition(){
        setBounds(100,100,300,250);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c=getContentPane();

        c.setLayout(null);
        JButton b1=new JButton("按钮一");
        JButton b2=new JButton("按钮二");
        b1.setBounds(10,10,80,30);//设置按钮在容器中的坐标和大小
        b2.setBounds(60,70,100,20);

        c.add(b1);
        c.add(b2);

    }

    public static void main(String[] args) {
        new AbsolutePosition();
    }
}
