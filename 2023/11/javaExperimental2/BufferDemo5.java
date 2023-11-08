import java.io.*;

public class BufferDemo5 {
    public static void main(String[] args) {
        File f=new File("F:\\javacode\\javalearn\\IO\\word.txt");
        FileOutputStream out=null;
        BufferedOutputStream bo=null;
        try {
            out=new FileOutputStream(f);
            bo=new BufferedOutputStream(out);//将文件输出流包装
            String str="天生我材必有用,千金散去还复来";
            byte b[]=str.getBytes();
            bo.write(b);
            bo.flush();//刷新,强制将缓冲区数据写入文件中,即使缓冲区没有写满
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(out!=null){
                try {
                    out.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if(bo!=null){
                try {
                    bo.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
