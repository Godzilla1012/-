import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo2 extends JFrame  {

     JTextArea chatTextArea; // 聊天记录文本区域
     JTextField inputField; // 用户输入框
    JButton sendButton ;// 发送按钮

    public Demo2(){
        setTitle("聊天页面");
        chatTextArea = new JTextArea(); // 创建聊天记录文本区域
        chatTextArea.setEditable(false); // 设置文本区域为不可编辑
        JScrollPane scrollPane=new JScrollPane(chatTextArea);  //创建带滚动条的面板并将文本域放置在该面板

        inputField=new JTextField(20);//创建长度为20的输入框
        sendButton = new JButton("发送");//创建发送按钮
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message=inputField.getText();// 获取输入框中的消息
                if(!message.isEmpty()){
                    chatTextArea.append("user:"+message+"\n");// 在聊天记录文本区域中添加消息
                    inputField.setText("");// 清空输入框
                }
            }
        });
        JPanel panel1=new JPanel();//创建面板
        panel1.setLayout(new BorderLayout());//设置面板布局为边界布局
        panel1.add(scrollPane,BorderLayout.CENTER); // 在面板中添加带滚动条的文本区域

        JPanel panel2=new JPanel();// 创建输入面板
        panel2.setLayout(new BorderLayout());//设置面板布局为边界布局
        panel2.add(inputField,BorderLayout.CENTER);// 在输入面板中添加输入框
        panel2.add(sendButton,BorderLayout.EAST);// 在输入面板中添加发送按钮

        add(panel1,BorderLayout.CENTER);
        add(panel2,BorderLayout.SOUTH);

        setSize(400,300);//设置窗口大小
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Demo2();
    }
}
