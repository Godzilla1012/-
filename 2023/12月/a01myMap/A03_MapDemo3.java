package a01myMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A03_MapDemo3 {
    public static void main(String[] args) {
        //Map集合的第2种遍历方式

        //1.创建Map集合的对象
        Map<String,String>map=new HashMap<>();

        //2.添加元素
        map.put("1","2");
        map.put("2","3");
        map.put("3","4");

        //通过键值对对象进行遍历
        //通过一个方法获取所有的键值对象,返回一个Set集合
        Set<Map.Entry<String, String>> entries = map.entrySet();//map.entrySet ctrl+alt+v
       //遍历entries这个集合,得到里面的每一个键值对象
        for (Map.Entry<String,String>entry:entries){
            String key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+"="+value);
        }

        System.out.println("_____________________________-");
        //也可直接将map.entrySet写在for循环里
        for (Map.Entry<String,String>entry:map.entrySet()){
            String key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+"="+value);
        }

    }
}
