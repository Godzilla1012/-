package a04mytreemap;

import java.util.Comparator;
import java.util.TreeMap;

public class A01_TreeMapDemo1 {
    public static void main(String[] args) {
        //TreeMap是红黑树结构,可排序
                                               //()里添加比较器
        TreeMap<Integer,String>tm=new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;     //o1-o2升序         o2-o1降序
            }
        });
        tm.put(5,"yueliyue");
        tm.put(4,"kangshifu");
        tm.put(3,"jiugegetao");
        tm.put(2,"leibi");
        tm.put(1,"kekoukele");
        //Integer默认情况下按升序排列
        //String按照字母再按ASCLL码表中对应的数字进行排列
        System.out.println(tm); //升序排列

    }
}
