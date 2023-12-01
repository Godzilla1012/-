package a02myhashmap;

import java.util.*;

public class A02_HashMapDemo2 {
    public static void main(String[] args) {
        //统计投票数

        //1.定义一个数组,存4个景点
        String[]arr={"a","b","c","d"};
        //利用随机数模拟80个同学的投票,存储起来
        ArrayList<String>list=new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i < 80; i++) {
            int index=r.nextInt(arr.length);
            System.out.println(arr[index]);
            list.add(arr[index]);
        }
        //定义map集合,进行统计
        Map<String,Integer>hm=new HashMap<>();
        for (String name:list){
            //判断当前景点在map中是否存在
            if (hm.containsKey(name)){
                //存在
                //先获取景点已被投票的次数
                int count=hm.get(name);
                //表示景点又被投了一次
                count++;
                //把新的次数添加到哈希表中
                hm.put(name,count);
            }
            else {
                hm.put(name,1);
            }
        }
        System.out.println(hm);

        //求最大值
        int max=0;
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {//entries.for+回车
            Integer count = entry.getValue();
            if (count>max){
                max=count;
            }
        }
        System.out.println("max:"+max);

        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue()==max){
                System.out.println(entry.getValue());
            }
        }
    }
}
