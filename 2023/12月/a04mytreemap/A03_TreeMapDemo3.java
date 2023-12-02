package a04mytreemap;

import java.util.StringJoiner;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class A03_TreeMapDemo3 {

    public static void main(String[] args) {
        //统计每一个字符出现的字数
        String s="asdfghjkljgfdsdfghsasdfghjk";

        TreeMap<Character,Integer>tm=new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if (tm.containsKey(c)){
                int count=tm.get(c);
                count++;
                tm.put(c,count);
            }
            else {
                tm.put(c,1);
            }
        }
        //遍历集合,按照指定格式进行拼接
        StringBuilder sb=new StringBuilder();
//        tm.forEach(new BiConsumer<Character, Integer>() {
//            @Override
//            public void accept(Character character, Integer integer) {
//                sb.append);
//            }
//        });

        //简化形式
        tm.forEach((key,value)->sb.append(key).append("(").append(value).append(")"));
        System.out.println(sb);

        StringJoiner sj=new StringJoiner("","","");//指示开始标记,结束标记,间隔符号
        tm.forEach((key,value)->sj.add(key+"").add("(").add(value+"").add(")"));
        System.out.println(sj);
    }
}
