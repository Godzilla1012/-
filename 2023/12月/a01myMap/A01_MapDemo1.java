package a01myMap;

import java.util.HashMap;
import java.util.Map;

//Map类定义了双联集合所有的共性方法,是顶层接口,所有双联集合都可以继承
public class A01_MapDemo1 {
    public static void main(String[] args) {

        //创建map集合的对象
        Map<String,String> m=new HashMap<>();

        //添加元素
        //添加数据时,如果键不从在,把键值对象直接添加到map集合中
        //如果键值是存在的,则会覆盖
        m.put("郭靖","黄蓉");
        m.put("韦小宝","按时间");
        m.put("sdm","adk");
        m.put("韦小宝","adn");

        //remove按键删除,返回string类型
        String result=m.remove("郭靖");

        //清除所有键值
        //m.clear();

        //判断是否包含
        boolean KeyResult=m.containsKey("郭靖");
        System.out.println(KeyResult);
        //判断值是否存在
        boolean valResult=m.containsKey("小龙女");

        //判断集合的长度
        int size=m.size();
        System.out.println(size);
        //判断m是否为空
        boolean r=m.isEmpty();

        System.out.println(m);
    }
}
