package a01myMap;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class A04_MapDemo4 {

    public static void main(String[] args) {
        //Map集合的第三种遍历方式
        //1.创建map集合的对象
        Map<Integer,Integer>map=new HashMap<>();

        //2.添加元素

        map.put(1,2);
        map.put(2,3);
        map.put(3,4);
        map.put(4,5);

        //3.利用lambda表达式遍历
        //底层:forEach是利用第二种方法遍历,依次得到每一个键和值
        //再调用accept方法
        map.forEach(new BiConsumer<Integer, Integer>() {
            @Override
            public void accept(Integer integer, Integer integer2) {
                System.out.println(integer+"="+ integer2);
            }
        });
        System.out.println("__________");

        map.forEach((Integer integer, Integer integer2) ->{
                System.out.println(integer+"="+ integer2);
            }
        );




        System.out.println("__________");

        map.forEach((integer, integer2) -> System.out.println(integer+"="+ integer2));
    }



}
