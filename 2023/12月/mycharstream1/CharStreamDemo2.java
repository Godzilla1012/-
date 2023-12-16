package mycharstream1;

import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //有参read
        FileReader fr=new FileReader("a.txt");
        char[]chars=new char[2];
        int len;
        while ((len=fr.read(chars))!=-1){
            //把数组中的数据变为字符串再打印
            System.out.println(new String(chars,0,len));//一次读len个
        }
        fr.close();
    }
}
