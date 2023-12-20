import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.*;

public class Main extends JFrame  {
    JButton btn1;
    JButton btn2;

    public Main(){

        btn1=new JButton("加密文件");
        btn2=new JButton("解密文件");

        Container container=getContentPane();
        container.setLayout(new FlowLayout());

        container.add(btn1);
        container.add(btn2);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    JFileChooser fileChooser = new JFileChooser();//用于创建文件选择对话框，让用户可以浏览文件系统并选择文件或目录

                    int result = fileChooser.showSaveDialog(null);//showSaveDialog显示文件选择对话框
                                 //参数决定了对话框在哪个组件的上方居中显示。如果传入null值，则对话框将显示在屏幕的中央。

                    if (result == JFileChooser.APPROVE_OPTION) {//表示用户已经选择了文件并点击了"保存"或"打开"按钮。
                        File file = fileChooser.getSelectedFile();//getSelectedFile()用于获取用户在文件选择对话框中选择的文件或目录。
                        try {                                     //如果用户取消了操作或者关闭了对话框，则返回null。
                          //执行加密操作
                            encrypt en=new encrypt(file);
                            String encryptedContent = en.encrypt();
                            saveToFile s=new saveToFile(encryptedContent,file);
                            s.save();
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        } finally {
                            JOptionPane.showMessageDialog(null, "文件已成功加密！", "加密完成", JOptionPane.INFORMATION_MESSAGE);
                            //消息对话框的父组件,传入null表示没有明确的父组件       message 是要显示的消息内容  title 是消息对话框的标题   消息类型，这里是指信息类型
                        }
                    }
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showSaveDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    try {
                        //执行解密操作
                        decipher d=new decipher(file);
                        String decipher = d.decipher();
                        saveToFile s=new saveToFile(decipher,file);
                        s.save();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    } finally {
                        JOptionPane.showMessageDialog(null, "文件已成功解密！", "解密完成", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        });
        setSize(400,200);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Main();
    }
}