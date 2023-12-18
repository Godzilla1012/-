package myconvertstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class ConvertStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //将GBK文件转成UTF-8文件
        FileReader fr=new FileReader("h.txt", Charset.forName("GBK"));
        FileWriter fw=new FileWriter("i.txt",Charset.forName("UTF-8"));
        int b;
        while ((b=fr.read())!=-1){
            fw.write(b);
        }
        fw.close();
        fr.close();
    }
}
