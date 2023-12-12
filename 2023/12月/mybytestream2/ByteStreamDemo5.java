package mybytestream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo5 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        //文件拷贝2.0
        FileInputStream fis=new FileInputStream("C:\\Users\\29944\\Documents\\Tencent Files\\2994459354\\FileRecv\\shiping.mp4");
        FileOutputStream fos=new FileOutputStream("copy.mp4");

        int len;
        byte[]bytes=new byte[1024*1024*5];
        while ((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);//写入bytes中0开始的前len个数据
        }
        fos.close();
        fis.close();

        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
