package a01mystream;

import java.util.ArrayList;
import java.util.Collections;

public class StreamDemo1 {
    public static void main(String[] args) {
        ArrayList<String>list1=new ArrayList<>();
        Collections.addAll(list1,"张无忌","周正若","赵敏","张强","张三丰");
        //把所有姓张的添加在新集合中
        ArrayList<String>list2=new ArrayList<>();
        for (String name : list1) {
            if (name.startsWith("张")){
                list2.add(name);
            }
        }
        //把姓张的,长度为三的添加在新集合中
        ArrayList<String>list3=new ArrayList<>();
        for (String name : list2) {
            if (name.length()==3){
                list3.add(name);
            }
        }
        for (String name : list3) {
            System.out.println(name);
        }
        System.out.println(list3);
        ///使用stream流来写
        System.out.println("_____________________");
        list1.stream().filter(name->name.startsWith("张")).filter(name->name.length()==3).forEach(name-> System.out.println(name));

    }
}
