import java.io.*;

public class Demo3 {
    public static void main(String[] args) {
        File f=new File(("word.text"));
        FileOutputStream out=null;
        try {
            out=new FileOutputStream(f,true);  //true:追加内容   false:替换内容
            String str="你见过凌晨四点的洛杉矶吗?";
            byte b[]=str.getBytes();   //字符串转化为字节数组
            out.write(b);
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(out!=null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        FileInputStream in=null;
        try {
            in=new FileInputStream(f);  //输入流读文件
            byte b2[]=new byte[200];    //缓冲区
            int len=in.read(b2);
            in.read(b2);
            System.out.println("文件中的数据是"+new String(b2,0,len));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in!=null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
