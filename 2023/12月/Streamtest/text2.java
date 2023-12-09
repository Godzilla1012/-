package a02test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class text2 {
    public static void main(String[] args) {
        //创建一个集合,添加字符串姓名年龄
        //保留年龄大于24的人,将结果收集到Map集合中,姓名为键,年龄为值
        ArrayList<String>list=new ArrayList<>();
        Collections.addAll(list,"zhangsan,23","lisi,24","wangwu,25","zhaoliu,52");
        Map<String, String> map = list.stream().filter(s -> (Integer.parseInt(s.split(",")[1])>24)).collect(Collectors.toMap(s -> s.split(",")[0], s -> s.split(",")[1]));
        System.out.println(map);
    }
}
