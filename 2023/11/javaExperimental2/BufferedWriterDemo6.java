import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo6 {
    public static void main(String[] args) {
        File f=new File("word.txt");
        FileWriter fw=null;
        BufferedWriter bw=null;
        try{
            fw=new FileWriter(f);
            bw=new BufferedWriter(fw);  //将文件输出流包装成缓冲字符流
            String str1="世界这么大";
            String str2="我想去看看";
            bw.write(str1);
            bw.newLine();   //换行
            bw.write(str2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {//先创建的后关闭
            if(fw!=null){
                if(bw!=null){
                    try {
                        bw.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                try {
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }

    }
}
