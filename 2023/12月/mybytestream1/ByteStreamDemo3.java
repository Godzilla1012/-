package mybytestream1;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //write(int b)
        FileOutputStream fos=new FileOutputStream("a.txt");
        fos.write(97);
        fos.write(98);


        //write(byte[] b)
        byte[]bytes={97,98,99,100,101};
        fos.write(bytes);


        //write(byte[] b,int off,int len)
        //off:起始索引       len:个数
        fos.write(bytes,1,2);


        fos.close();


    }
}
