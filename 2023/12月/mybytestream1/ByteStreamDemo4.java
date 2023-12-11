package mybytestream1;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo4 {
    public static void main(String[] args) throws IOException {
        //换行写:再次写出一个换行符
        //windows:   \r\n
        //Linux       \n
        //Mac         \r
        //java中对回车换行进行了优化 \r \n都可以

        //续写:打开续写开关    在创建对象时加个true

        FileOutputStream fos=new FileOutputStream("a.txt",true);
        String  str1= "helloworld";
        byte[] bytes1 = str1.getBytes();
        fos.write(bytes1);

        //写入换行符
        String wrap="\r\n";
        byte[] bytes2 = wrap.getBytes();
        fos.write(bytes2);

        String str2="666";
        byte[] bytes3 = str2.getBytes();
        fos.write(bytes3);

        fos.close();

    }
}
