package mybytestream2;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo4 {
    public static void main(String[] args) throws IOException {
        //文件拷贝  一次读多个数据 光标移动多格
        FileInputStream fis=new FileInputStream("a.txt");
        byte[]bytes=new byte[2];
        int len = fis.read(bytes);//返回值:一次读多少个字节数据
        System.out.println(len);
        String str = new String(bytes,0,len);//参数:读bytes的从0开始的前len个数据
        System.out.println(str);
        fis.close();
    }
}
