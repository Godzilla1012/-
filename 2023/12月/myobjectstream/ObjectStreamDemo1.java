package myobjectstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //序列化流将对象写入本地文件

        Student stu=new Student("张三",23,"南京");

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("j.txt"));
        oos.writeObject(stu); //要写入的stu类必须实现Serializable
        oos.close();
    }
}
