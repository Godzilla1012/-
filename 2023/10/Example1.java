import javax.swing.*;
import java.awt.*;

public class Example1 extends JFrame{   //JFrame类在swing包里
    public void CreatJFrame(String title){
        JFrame jFrame=new JFrame(title);
        Container container= jFrame.getContentPane(); //container在awt包里
        JLabel jl=new JLabel("这是一个JFrame窗体");
        jl.setHorizontalAlignment(SwingConstants.CENTER);

        container.add(jl);
        container.setBackground(Color.white);
        jFrame.setVisible(true);
        jFrame.setSize(2000,1500);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Example1().CreatJFrame("创建一个JFrame窗体");
    }

}
