package mybytestream2;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //字节输入流FileInputStream
        //字节输入流细节:
        //文件不存在直接报错
        //读出来的是ASCII上的数字
        //读到尾返回-1
        //每read一次,光标后移一格

        FileInputStream  fis=new FileInputStream("a.txt");
        int b1 = fis.read();
        System.out.println(b1);
        fis.close();
    }
}
