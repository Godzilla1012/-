package a01mystream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo10 {
    //collect(Collector collector)
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"张无忌-男-15", "周正若-女-14", "赵敏-女-18", "张强-男-19", "张三丰-男-28");

        //将所有的男性收集起来到list集合中
        List<String> newlist1 = list.stream().filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toList());
        System.out.println(newlist1);

        //收集到set集合中
        Set<String> newlist2 = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toSet());
        System.out.println(newlist2);
        //list有序有重复
        //set无序无重复

        //收集到Map集合中
        //说清谁作为键,谁作为值            注意:键不可以重复
        //键:姓名  值:年龄
        Map<String, Integer> map = list.stream().filter(s -> "男".equals(s.split("-")[1]))
                //toMap的参数:1键的规则,2值的规则
                //参数一:
                //Function的参数:1流里面数据的类型,2Map里数据的类型
                //apply形参:依次表示流中的每一个数据
                //    方法体:生成键或值的代码
                //    返回值:已生成的键或值

                .collect(Collectors.toMap(new Function<String, String>() {
                    @Override
                    public String apply(String s) {

                        return s.split("-")[0];
                    }
                }, new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s.split("-")[2]);
                    }
                }));
        System.out.println(map);
        System.out.println("------------------------");
        Map<String, Integer> map2 = list.stream().filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(
                        s -> s.split("-")[0],
                        s -> Integer.parseInt(s.split("-")[2])
                ));
        System.out.println(map2);

    }
}
