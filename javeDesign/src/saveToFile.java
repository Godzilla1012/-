import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class saveToFile {
    String content;
    File file;

    public saveToFile(String content,File file) {
        this.file = file;
        this.content = content;
    }

    public void save() throws IOException {

        BufferedWriter bw=new BufferedWriter(new FileWriter(file));
        bw.write(content);
        bw.close();
    }

}
