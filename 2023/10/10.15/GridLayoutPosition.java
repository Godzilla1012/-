import javax.swing.*;
import java.awt.*;

public class GridLayoutPosition extends JFrame {
    GridLayoutPosition(){
        setBounds(100,100,300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        Container c=getContentPane();
        c.setLayout(new GridLayout(7,3,5,5));//设置为网格布局,7行3列
                                              //水平间距为5像素,垂直间距为5像素
        for (int i = 0; i < 20; i++) {
            c.add(new JButton("按钮"+i));
        }
    }

    public static void main(String[] args) {
        new GridLayoutPosition();
    }
}
