import javax.swing.*;
import java.awt.*;

public class GridBagConstraintsDemo {
    JFrame f=new JFrame();
    Container c;  //主容器
    void createFrame(){
        c=f.getContentPane();
        c.setLayout(new GridLayout());
        f.setSize(800,600);
       f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setLayout(new GridLayout());
    }

    void init(){
        GridBagConstraints g1=new GridBagConstraints();
        GridBagConstraints g2=new GridBagConstraints();
        GridBagConstraints g3=new GridBagConstraints();
        g1.gridx=0;
        g1.gridy=0;
        g1.gridwidth=1;
        g1.gridheight=1;
        c.add(new JButton("组件1"),g1);
        g2.gridx=1;
        g2.gridy=1;
        g2.gridwidth=1;
        g2.gridheight=1;
        c.add(new JButton("组件1"),g2);
        g3.gridx=2;
        g3.gridy=2;
        g2.gridwidth=1;
        g2.gridheight=1;
        c.add(new JButton("组件1"),g3);


    }
    void createButton() {
        for (int i = 0; i < 9; i++) {
            GridBagConstraints g1 = new GridBagConstraints();
            g1.gridx=i;
            g1.gridy=0;
            g1.gridwidth=1;
            g1.gridheight=1;
            c.add(new JButton("组件"),g1);

            GridBagConstraints g2 = new GridBagConstraints();
            g2.gridx=0;
            g2.gridy=i;
            g2.gridwidth=1;
            g2.gridheight=1;
            c.add(new JButton("组件"),g2);
        }
    }

    public static void main(String[] args) {
        GridBagConstraintsDemo d=new GridBagConstraintsDemo();
        d.createFrame();
    //    d.createButton();
        d.init();
        d.f.setVisible(true);


    }
}
