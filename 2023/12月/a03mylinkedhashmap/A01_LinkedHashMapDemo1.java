package a03mylinkedhashmap;

import java.util.LinkedHashMap;

public class A01_LinkedHashMapDemo1 {
    public static void main(String[] args) {
        //LinkHashMap由键决定,有序,无索引
        //底层数据结构是哈希表,每个键值对元素额外多了一个双链表机制记录存储顺序

        //1.创建集合
        LinkedHashMap<String,Integer>lhm=new LinkedHashMap<>();

        //添加元素
        lhm.put("c",123);
        lhm.put("a",456);
        lhm.put("a",13);
        lhm.put("d",23);

        //打印
        System.out.println(lhm);
        //可以保持顺序
    }
}
