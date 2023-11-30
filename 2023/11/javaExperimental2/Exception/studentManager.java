package javaExperimental6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class studentManager {
    Integer id;
    String name;
    Map<Integer,String>map=new HashMap<>();
    void addStudent()throws MyException{


        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学生信息");
        id=sc.nextInt();
        name=sc.next();
        Set<Integer>keys=map.keySet();//获取所有的键
        for (Integer key:keys){
            if(key==id){
                throw new MyException("该学号已存在");
            }
        }
        map.put(id,name);
        System.out.println(map);
    }

    public static void main(String[] args) {
        studentManager s=new studentManager();


        try{
            while(true){
                s.addStudent();
            }

        } catch (MyException e) {
            System.out.println(e);
        }

    }
}
