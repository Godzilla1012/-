package a01mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo7 {
    public static void main(String[] args) {
        //distinct        元素去重(依赖hashCode和equals方法)
        //concat          合并a和b两个流为一个流
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "张无忌","张无忌","张无忌","张无忌", "周正若", "赵敏", "张强", "张三丰");
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "麻煜立", "张菲");

        //distinct
        list1.stream().distinct().forEach(s-> System.out.println(s));

        System.out.println("__________________________________");
        //concat
        Stream.concat(list1.stream(),list2.stream()).forEach(s-> System.out.println(s));


    }
}
