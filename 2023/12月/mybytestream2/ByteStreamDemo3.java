package mybytestream2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo3 {

    //文件拷贝视频
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        FileInputStream fis=new FileInputStream("C:\\Users\\29944\\Documents\\Tencent Files\\2994459354\\FileRecv\\shiping.mp4");
        FileOutputStream fos=new FileOutputStream("copy.mp4");
        int b;
        while((b=fis.read())!=-1){
            fos.write(b);
        }
        fos.close();
        fis.close();

        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
