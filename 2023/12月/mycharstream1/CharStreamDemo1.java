package mycharstream1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("a.txt");
        //读取数据
        //默认一个字节一个字节读取
        //遇到中文一次读多个(3)字节


        //read()细节
        //读取后会解码并转成10进制
        //0110 0001-->97
        //中文:11100110 10110001 10001001-->27721

        int ch;
        while ((ch=fr.read())!=-1){
            System.out.print((char)ch);
        }
        fr.close();

    }
}
