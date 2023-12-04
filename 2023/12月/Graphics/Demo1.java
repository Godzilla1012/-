import javax.swing.*;
import java.awt.*;
class smileFacePanel extends Panel {
    smileFacePanel() {
        setBackground(Color.BLACK);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 300, 300);

        g.setColor(Color.black);
        g.fillOval(140,150,30,30);
        g.fillOval(240,150,30,30);

        g.setColor(Color.red);
        // 绘制弧线，参数分别为x、y、长度、高度、起始角度、弧线角度
        g.drawArc(150, 230, 100, 60, 0, -180);

    }
}


    public class Demo1 extends JFrame {
        JButton b1 = new JButton();
        JButton b2 = new JButton();

        public Demo1() {
            setLayout(new BorderLayout());
            setSize(700, 700);

            smileFacePanel panle = new smileFacePanel();
            add(panle);

            setVisible(true);
            ;
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> new Demo1());
        }
    }

