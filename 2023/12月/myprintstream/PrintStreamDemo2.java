package myprintstream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //字符打印流                                                       开启自动刷新,写入缓冲区的内容直接写入本地文件
        PrintWriter pw=new PrintWriter(new FileWriter("l.txt"),true);
        pw.println("原神真好玩");
        pw.print("我是OP");
        pw.printf("%s是个玩原神的","小奶牛");
    }
}
