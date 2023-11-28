import javax.swing.*;

public class JMenuItem1 extends JFrame {

    public JMenuItem1(){
        super("JMenu1");   //设置窗口标题为JMenu1
        JMenuBar MBar=new JMenuBar();  //创建菜单栏对象
        JMenu mfile=buildFileMenu();   //创建mfile菜单
        MBar.add(mfile);               //在菜单栏中添加mfile菜单
        setJMenuBar(MBar);             //将菜单栏设置到窗口中
        setSize(300,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public JMenu buildFileMenu(){
        JMenu thefile=new JMenu("文件");
        JMenuItem newf=new JMenuItem("新建");
        JMenuItem open=new JMenuItem("打开");
        JMenuItem close=new JMenuItem("关闭");
        JMenuItem exit=new JMenuItem("退出");
        thefile.add(newf);
        thefile.add(open);
        thefile.add(close);
        thefile.add(exit);
        return thefile;
    }

    public static void main(String[] args) {
        new JMenuItem1();
    }
}