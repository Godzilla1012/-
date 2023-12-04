import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Demo2 extends JFrame {
   Color a=Color.BLACK;
    public Demo2(){
        setLayout(new BorderLayout());
        JButton b[]=new JButton[5];
        for (int i = 0; i < 5; i++) {
           b[i]=new JButton();
        }
        b[0].setText("红色");
        b[1].setText("黄色");
        b[2].setText("蓝色");
        b[3].setText("绿色");
        b[4].setText("黑色");
        JPanel jPanel1=new JPanel();
        jPanel1.setLayout(new FlowLayout());
        for (int i = 0; i <5; i++) {
            jPanel1.add(b[i]);
        }
        add(jPanel1,BorderLayout.NORTH);
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            b[0].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    removeAllLinePanels();//如果已存在画板就清除
                    linepanel panel2=new linepanel(Color.red);
                    add(panel2,BorderLayout.CENTER);
                    revalidate();
                    repaint();

                }
            });
            b[1].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    removeAllLinePanels();
                    linepanel panel2=new linepanel(Color.YELLOW);
                    add(panel2,BorderLayout.CENTER);
                    revalidate();
                    repaint();

                }
            });
            b[2].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    removeAllLinePanels();
                    linepanel panel2=new linepanel(Color.BLUE);
                    add(panel2,BorderLayout.CENTER);
                    revalidate();
                    repaint();

                }
            });
            b[3].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    removeAllLinePanels();
                    linepanel panel2=new linepanel(Color.GREEN);
                    add(panel2,BorderLayout.CENTER);
                    revalidate();
                    repaint();

                }
            });
            b[4].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    removeAllLinePanels();
                    linepanel panel2=new linepanel(Color.BLACK);
                    add(panel2,BorderLayout.CENTER);
                    revalidate();
                    repaint();

                }
            });

        }

    private void removeAllLinePanels() {
        Component[] components = getContentPane().getComponents();
        for (Component component : components) {
            if (component instanceof linepanel) {
                remove(component);
            }
        }
    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->new Demo2());
    }
}

class linepanel extends JPanel{
    Color lineColor;
    linepanel(Color c){
        setBackground(Color.WHITE);
        lineColor=c;
    }

    public void paint(Graphics g){
        super.paint(g);//确保正确清除原始的绘图区域。
        g.setColor(lineColor);
        g.drawLine(30,30,200,200);
    }

}