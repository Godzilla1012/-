import javax.swing.*;
import java.awt.*;

public class Drawicon implements Icon {
    int width;
    int height;
    public int getIconHeight(){
        return this.height;
    }
    public int getIconWidth(){
        return  this.width;
    }
    public Drawicon(int width,int height){
        this.width=width;
        this.height=height;
    }
    public void paintIcon(Component arg0,Graphics arg1,int x,int y){
        arg1.fillOval(x,y,width,height);
    }

    public static void main(String[] args) {
        Drawicon icon=new Drawicon(15,15);
        JLabel j=new JLabel("测试",icon,SwingConstants.CENTER);
        JFrame jf=new JFrame();
        Container c=jf.getContentPane();
        c.add(j);
        c.setBackground(Color.white);
        jf.setVisible(true);
        jf.setSize(200,150);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
