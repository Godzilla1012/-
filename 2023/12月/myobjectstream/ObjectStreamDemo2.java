package myobjectstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectStreamDemo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //反序列化流将文件中的数据读取到程序中

        //序列化后的数据修改后就不能反序列化,不能修改
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("j.txt"));
        Object o = ois.readObject();
        System.out.println((Student)o);
        ois.close();
    }
}
