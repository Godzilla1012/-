package a04mytreemap;

import java.util.TreeMap;

public class A02_TreeMapDemo2 {
    public static void main(String[] args) {

        TreeMap<Student,String>tm=new TreeMap<>();
        Student s1=new Student("zhangsan",26);
        Student s2=new Student("lisi",24);
        Student s3=new Student("wangwu",25);

        tm.put(s1,"jiangsu");
        tm.put(s2,"shanxi");
        tm.put(s3,"helan");
        System.out.println(tm);
    }
}
