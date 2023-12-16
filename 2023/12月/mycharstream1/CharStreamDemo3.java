package mycharstream1;

import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo3 {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("b.txt",true);//第二个参数:续写开关
        fw.write(4856);
        //字符串写入
        fw.write("你好??");

        //字符数组写入
        char[]chars={'a','b','c','我'};
        fw.write(chars);

         fw.close();//如果不关闭流,那么数据可能就会被存在缓冲区中,不会写入本地文件
    }
}
