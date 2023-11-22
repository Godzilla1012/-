import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo extends JFrame implements ActionListener, MouseListener {
    JButton btn1;
    JTextField are;//文本域

    public Demo(){
        are=new JTextField(32);
        btn1=new JButton("保存");

//        btn1.addActionListener(this);
//        are.addMouseListener(this);

        Container container=getContentPane();
        container.setLayout(new FlowLayout());

        container.add(btn1);
        container.add(are);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btn1) {
                    // 弹出文件选择对话框
                    JFileChooser fileChooser = new JFileChooser();//用于创建文件选择对话框，让用户可以浏览文件系统并选择文件或目录
                    int result = fileChooser.showSaveDialog(null);//showSaveDialog显示文件选择对话框，并等待用户进行文件保存操作
                    //参数决定了对话框在哪个组件的上方居中显示。如果传入null值，则对话框将显示在屏幕的中央。
                    if (result == JFileChooser.APPROVE_OPTION) {//表示用户已经选择了文件并点击了"保存"或"打开"按钮。
                        File file = fileChooser.getSelectedFile();//getSelectedFile()用于获取用户在文件选择对话框中选择的文件或目录。
                        try {                                     //如果用户取消了操作或者关闭了对话框，则返回null。
                            // 将文本保存到所选的文件中
                            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                            writer.write(are.getText());
                            writer.close();
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }finally {
                           // JFrame
                        }
                    }
                }
            }
        });
        setSize(640,400);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Demo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}