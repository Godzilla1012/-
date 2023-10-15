import javax.swing.*;
import java.awt.*;

public class FlowLayoutPosition extends JFrame {
    public FlowLayoutPosition(){
        setBounds(100,100,300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        Container c=getContentPane();                 //水平间距和竖直间距
        c.setLayout(new FlowLayout(FlowLayout.LEFT,20,30));  //设置窗体布局为流布局管理器,LEFT:左对齐
        for(int i=0;i<10;i++){
            c.add(new JButton(("按钮"+i)));
        }
    }

    public static void main(String[] args) {
        new FlowLayoutPosition();
    }
}
