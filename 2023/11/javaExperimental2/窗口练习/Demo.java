import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Constructor;

public class Demo extends JFrame {

    JButton button;
    JScrollPane jScrollPane;
    JTextArea text;
    public Demo(){
        Container c=getContentPane();
        c.setLayout(new BorderLayout());

        button=new JButton("按钮");
        c.add(button,BorderLayout.SOUTH);

        JPanel panel=new JPanel(new FlowLayout(FlowLayout.CENTER));
        text=new JTextArea("你好");
        panel.add(text);

        jScrollPane=new JScrollPane(panel);
        jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        c.add(jScrollPane,BorderLayout.CENTER);


        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }
    public static void main(String[] args) {
        new Demo();
    }
}