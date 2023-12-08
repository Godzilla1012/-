package a01mystream;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class StreamDemo8 {
    public static void main(String[] args) {
        //map         map方法执行完毕后,流上的数据变成了整数
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-15", "周正若-14", "赵敏-18", "张强-19", "张三丰-28");
        //需求:只获取年龄打印
        list.stream().map(new Function<String, Integer>() {//第一个类型:流中原本的数据类型,第二个:转换后的类型

            public Integer apply(String s){//s:依次表示流里面的每一个数据
                String[] arr = s.split("-");//将字符串按-切割,0索引表示汉字,1索引表示数字
                String ageString=arr[1];
                int age = Integer.parseInt(ageString);//将string转化为int类型
                return age;  //返回值转化之后的数据
            }
        }).forEach(s-> System.out.println(s));

        System.out.println("____________________________________");
        list.stream().map(s->Integer.parseInt(s.split("-")[1]));

    }

}
