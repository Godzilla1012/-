import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class MyImageIcon extends JFrame {
    public MyImageIcon(){
        Container container=getContentPane();   //创建一个容器
        JLabel jl=new JLabel("这是一个窗体",JLabel.CENTER);  //创建标签,使标签在中间
        URL url=MyImageIcon.class.getResource("pic.png"); //用url获取图片所在的URL
        ImageIcon icon= new ImageIcon(url);  //实例化ImageIcon图像
        jl.setIcon(icon);               //为标签设置图片
        jl.setHorizontalAlignment(SwingConstants.CENTER);
       // jl.setOpaque(true);         将标签设置为不透明状态
        container.add(jl);            //将标签加入到容器中
        setSize(1000,700);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MyImageIcon();           //实例化MyImageIcon对象
    }
}
