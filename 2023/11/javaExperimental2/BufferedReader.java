import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader {
    public static void main(String[] args) {
        File f=new File("word.txt");
        FileReader fr=null;
        FileReader br=null;
        try {
           fr=new FileReader(f);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            if(fr!=null){
                try {
                    fr.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
