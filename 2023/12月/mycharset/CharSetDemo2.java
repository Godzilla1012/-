package mycharset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharSetDemo2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //编码,解码

        //编码
        String str="洒洒水";
        byte[] bytes1 = str.getBytes();//默认UTF-8编码
        System.out.println(Arrays.toString(bytes1));

        byte[] bytes2 = str.getBytes("GBK");//指定GBK编码
        System.out.println(Arrays.toString(bytes2));

        //解码
        String str1=new String(bytes1);
        System.out.println(str1);

        String str2=new String(bytes1,"GBK");//指定使用GBK解码
        System.out.println(str2);
    }

}
