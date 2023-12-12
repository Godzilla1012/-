package mybytestream2;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");
        int b;
        while ((b = fis.read()) != -1) {
            System.out.println((char) b);
        }

        fis.close();
    }
}