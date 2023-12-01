package a02myhashmap;

import a04mytreemap.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A01_HashMapDemo1 {
    public static void main(String[] args) {
        //1.创建hashmap
        HashMap<Student,String>hm=new HashMap<>();

        //2.创建学生对象
        Student s1=new Student("zhangsan",23);
        Student s2=new Student("lisi",23);
        Student s3=new Student("wangwu",23);

        //3.添加元素
        hm.put(s1,"江苏");
        hm.put(s2,"浙江");
        hm.put(s3,"福建");

        //4.遍历集合
        Set<Student>keys=hm.keySet();
        for(Student key:hm.keySet()){
            String value=hm.get(key);
            System.out.println(key+":"+value);
        }

        System.out.println("__________________________");
        Set<Map.Entry<Student, String>> entries = hm.entrySet();
        for (Map.Entry<Student,String>entry:entries){
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+":"+value);
        }

        System.out.println("________________");
        hm.forEach(((student, s) -> {
            System.out.println(student+":"+s);
        }));


    }
}
