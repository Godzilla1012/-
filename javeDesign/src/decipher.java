import java.io.*;

public class decipher {
    File file;
    public decipher(File file){
        this.file = file;
    }
    String decipher() throws IOException {
        BufferedReader br=new BufferedReader(new FileReader(file));
        StringBuilder sb=new StringBuilder();
        int b;
        while ((b = br.read()) != -1) {
            sb.append((char)(b-3));
        }

        br.close();
        return sb.toString();
    }
}
