import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo3 extends JFrame {
    JPanel panel;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;

    public Demo3(){
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        panel=new JPanel();
        add(panel);

        button1=new JButton("红色");
        button2=new JButton("绿色");
        button3=new JButton("黄色");
        button4=new JButton("蓝色");
        button5=new JButton("白色");

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.red);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.green);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.yellow);
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.blue);
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.white);
            }
        });



        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);

    }

    public static void main(String[] args) {
        new Demo3();
    }
}
//在Java中，可以使用setBackground()方法设置面板的背景色。该方法接受一个Color对象作为参数，表示要设置的颜色。例如：
//
//        JPanel panel = new JPanel();
//        panel.setBackground(Color.RED); // 将面板的背景色设置为红色