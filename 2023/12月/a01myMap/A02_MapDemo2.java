package a01myMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A02_MapDemo2 {
    public static void main(String[] args) {
        //map的第一种遍历方式

        //1.创建map集合的对象
        // 键的类型 值的类型 表的名字
        Map<String,String>map=new HashMap<>();

        map.put("1","2");
        map.put("2","3");
        map.put("3","4");
        //获取所有的键值,放到一个单列集合(Set类型)中
        Set<String>keys=map.keySet();

        //遍历单列集合,得到每一个键
        for (String key:keys){
            //System.out.println(key);
            //利用map集合中的键获取每一个值
            String value=map.get(key);
            System.out.println(key+":"+value);
        }
    }
}
