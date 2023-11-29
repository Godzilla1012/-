import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo2 extends JFrame {
    JLabel jLabel;
    JButton jbutton;

    public Demo2(){
        setLayout(new FlowLayout());
        jLabel=new JLabel("你好");
        jLabel.setPreferredSize(new Dimension(200,200));//设置标签大小
        Container c=getContentPane();
        c.add(jLabel);


        jbutton=new JButton("切换");
        jbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text=jLabel.getText();
                if(text=="你好"){
                    jLabel.setText("再见");
                }
                else {
                    jLabel.setText("你好");
                }
            }
        });
        add(jbutton);




        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Demo2();
    }
}
