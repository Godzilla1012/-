package mybytestream1;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //字节输出流FileOutputStream
        //写出一段文字到本地文件中

        FileOutputStream fos=new FileOutputStream("F:\\javacode\\javalearn\\newIO\\src\\a.txt");
        fos.write(97);
        fos.close();
    }
}
