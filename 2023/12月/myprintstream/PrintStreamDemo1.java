package myprintstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

public class PrintStreamDemo1 {
    public static void main(String[] args) throws FileNotFoundException {
        //字节打印流
        PrintStream ps=new PrintStream(new FileOutputStream("k.txt"),true, Charset.forName("UTF-8"));

        ps.println(97);      //数据原样写出

        ps.print(true);
        ps.printf("%s杀死了%s","癌症","阿强");

        ps.close();
    }
}
