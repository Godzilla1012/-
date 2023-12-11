package mybytestream1;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo2 {

        public static void main(String[] args) throws IOException {
            //字节输出流细节
            //1.参数也可以是File对象
            //2.如果文件不存在会创建一个新的文件夹
            //3.如果文件已存在,则会清空文件

            //写数据
            //write方法的参数是整数,写到文件中的是整数在ASCII上对应的字符

            //释放资源
            //每次使用完之后必须释放资源,解除资源的占用

            FileOutputStream fos=new FileOutputStream("F:\\javacode\\javalearn\\newIO\\src\\b.txt");
            fos.write(97);
            fos.close();
        }

}
