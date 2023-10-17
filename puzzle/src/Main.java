import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.Dimension;
import javax.swing.ImageIcon;
public class Main extends JFrame{

    public Main(){
        setBounds(100,100,500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new GridLayout(4,4,2,2));
        Container c=getContentPane();
     //   c.setLayout(new GridLayout(3,2,5,5));

        JButton btn[]=new JButton[16];
        for (int i = 0; i < 16; i++) {
            btn[i]=new JButton(""+i);
            c.add(btn[i]);

        }


        // 绘制背景图片

        setVisible(true);
        for (int i = 0; i < 16; i++) {
            setVisible(true);
            ImageIcon icon = new ImageIcon("F:\\javacode\\javalearn\\puzzle\\src\\jpg ("+i+").jpg");
            int buttonWidth = btn[i].getWidth();
            int buttonHeight = btn[i].getHeight();
            ImageIcon scaledIcon = new ImageIcon(icon.getImage().getScaledInstance(buttonWidth, buttonHeight, java.awt.Image.SCALE_SMOOTH));
            btn[i].setIcon(scaledIcon);

        }

//        ImageIcon icon = new ImageIcon("jpg");
//        int buttonWidth = btn[4].getWidth();
//        int buttonHeight = btn[4].getHeight();
//        ImageIcon scaledIcon = new ImageIcon(icon.getImage().getScaledInstance(buttonWidth, buttonHeight, java.awt.Image.SCALE_SMOOTH));
//        btn[4].setIcon(scaledIcon);


        JButton[] x={null};  //存选中的按钮
        int[]y={0};  //存上个按钮的编号
        int[]n={0};  //存这个按钮的编号
        for (int i = 0; i < 16; i++) {
            JButton button = btn[i];
            if(y[0]==0)
                y[0]=i;
            n[0]=i;
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (x[0] == null) {
                        x[0] = button;

                        return;
                    } else {
//                        int index1 = c.getComponentZOrder(x[0]);
//                        int index2 = c.getComponentZOrder(button);
//                        c.remove(x[0]);
//                        c.remove(button);
//                        c.add(x[0], index2);
//                        c.add(button, index1);
//                        c.revalidate();
//                        x[0] = null;
//                        y[0] = 0;
                        swapButtons(button, x[0]);
//                        c.remove(x[0]);
//                        c.remove(button);
//                        c.add(x[0],y[0]);
//                        c.add(button,n[0]);
//                        c.revalidate();
                        x[0] = null;
                        y[0]=0;
                    }
                }
            });

        }


    }

    private void swapButtons(JButton button1, JButton button2) {
        Container c = getContentPane();
        int index1 = c.getComponentZOrder(button1);
        int index2 = c.getComponentZOrder(button2);
        if(index1>index2){
            c.remove(button1);
            c.add(button1, index2);
            c.remove(button2);

            c.add(button2, index1);
            c.revalidate();
        }
        else{
            c.remove(button1);
            c.add(button1, index2);
            c.remove(button2);

            c.add(button2, index1);

            c.revalidate();
        }

    }

    public static void main(String[] args) {
        new Main();
    }

}