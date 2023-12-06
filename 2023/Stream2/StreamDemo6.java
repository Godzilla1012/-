package a01mystream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class StreamDemo6 {
    public static void main(String[] args) {
        //filter 过滤       修改流中的数据不会改变列表中原来的数据
        //limit  获取前几个元素
        //skip   跳过前几个元素

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周正若", "赵敏", "张强", "张三丰");

        //filter
//        list.stream().filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {//s表示流里面的每个数据
//                //如果返回值为true表示当前数据留下,反之舍弃
//
//                return s.startsWith("张");
//            }
//        }).forEach(s-> System.out.println(s));

        list.stream().filter(s->s.startsWith("张")).forEach(s-> System.out.println(s));
        System.out.println("_______________________________________");
        //limit
        //skip
        list.stream().limit(3)
                .forEach(s-> System.out.println(s));
        System.out.println("_______________________________________");
        list.stream().skip(4)
                .forEach(s-> System.out.println(s));
    }
}
