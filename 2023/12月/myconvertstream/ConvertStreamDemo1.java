package myconvertstream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class ConvertStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //按照指定字符编码输出

        FileReader fr=new FileReader("h.txt", Charset.forName("UTF-8"));//指定GBK编码方式进行读取
        int ch;
        while ((ch=fr.read())!=-1){
            System.out.print((char) ch);
        }
        fr.close();
    }
}
