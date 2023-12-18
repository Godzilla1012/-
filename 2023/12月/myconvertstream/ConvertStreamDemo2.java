package myconvertstream;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class ConvertStreamDemo2 {
    public static void main(String[] args) throws IOException {
//        //利用转换流按指定字符编码写出
//        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("h.txt"),"GBK");
//        osw.write("你好拿红");
//        osw.close();

        FileWriter fw=new FileWriter("h.txt", Charset.forName("GBK"));
        fw.write("阿信阿信");
        fw.close();
    }
}
