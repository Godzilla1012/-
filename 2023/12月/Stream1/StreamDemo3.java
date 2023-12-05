package a01mystream;

import java.util.HashMap;

public class StreamDemo3 {
    public static void main(String[] args) {
        //双列集合  无法直接使用stream

        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("aaa",111);
        hm.put("bbb",222);
        hm.put("ccc",333);
        hm.put("ddd",444);

        //第一种获取steam流,受用keyset转化成键
        hm.keySet().stream().forEach(s-> System.out.println(s));

        //第二种获取strea流使用entrySet获取所有的键值对对象
        hm.entrySet().forEach(s-> System.out.println(s));

    }
}
