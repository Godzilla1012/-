import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJDialog extends JDialog {

    public  MyJDialog(MyFrame frame){
        super(frame,"第一个JDialong窗体",true);
        Container container=getContentPane();
        container.add(new JLabel("这是一个对话框"));
        setBounds(120,120,500,500);    //对话框大小
    }
}
 class MyFrame extends  JFrame{
    public static void main(String[] args) {
        MyFrame MF =new MyFrame();
        MF.setVisible(true);
        MF.setSize(1000,700);               //初始窗口的大小
        MF.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public MyFrame(){
        Container container=getContentPane();   //创建一个容器
        container.setLayout(null);  //选择布局管理器为空
        JLabel jl=new JLabel("这是一个JFrame窗体");
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(jl);
        JButton bl=new JButton("弹出对话框");
        bl.setBounds(100,100,100,21);   //对话框按钮的大小
        bl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MyJDialog(MyFrame.this).setVisible(true);
            }
        });
        container.add(bl);
       // container.setBackground(Color.white);
       // jl.setVisible(true);
       // jl.setSize(2000,1500);

    }
}

