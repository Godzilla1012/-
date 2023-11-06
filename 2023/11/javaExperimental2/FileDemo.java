import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo {
    public static void main(String[] args) {
        //通常的路径:word.txt
        //包中的路径:src\\包\\word.txt;
        //绝对路径:计算机中具体的位置
        File f1=new File("word.txt");
        File f2=new File("F:\\javacode\\javalearn\\word.txt");
        File f3=new File("F:\\javacode\\javalearn","word.txt");
        File dir=new File("F:\\javacode\\javalearn");//文件夹
        File f4=new File(dir,"word.txt");
//        System.out.println(f1.getAbsolutePath());
//        System.out.println(f2.getAbsolutePath());
//        System.out.println(f3.getAbsolutePath());
        System.out.println(f1.exists());//文件是否存在
        System.out.println(f4.getAbsolutePath());//输出文件的绝对路径
        System.out.println(f4.getName());  //输出文件名
        System.out.println(f4.isHidden()); //是否隐藏文件
        System.out.println(f4.length());   //输出文件大小,单位字节
        Date date=new Date(f4.lastModified());  //通过毫秒值建立日期类
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(date));//文件最后修改时间

        boolean del=f4.delete();//删除文件
        System.out.println(del);//删除文件是否成功
        try{
            boolean creat=f2.createNewFile();//创建新的空文件夹,f2得先初始化地址和名字
            System.out.println("文件是否创建成功:"+creat);
        }catch (IOException E){
            System.out.println(E);
        }
    }
}