package mytest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //拷贝文件夹,考虑子文件夹
        File src=new File("F:\\javacode\\javalearn\\newIO\\a");
        //目的地
        File dest=new File("F:\\javacode\\javalearn\\newIO\\b");
        copydir(src,dest);
    }

    static void copydir(File src,File dest) throws IOException {
        dest.mkdirs();
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()){//文件开始,文件结束
                FileInputStream fis=new FileInputStream(file);
                FileOutputStream fos=new FileOutputStream(new File(dest,file.getName()));
                                                                //父级路径  子级路径
                byte[] bytes = new byte[1024];
                int len;
                while((len=fis.read(bytes))!=-1){
                    fos.write(bytes,0,len);
                }
                fos.close();
                fis.close();
            }else {
                copydir(file,new File(dest,file.getName()));
            }
        }
    }
}
