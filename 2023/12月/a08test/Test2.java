package a08test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        //带概率的随机点名
        ArrayList<Integer>list=new ArrayList<>();
        //添加数据
        Collections.addAll(list,1,1,1,1,1,1,1,0,0,0);
        //打乱集合
        Collections.shuffle(list);
        System.out.println(list);
        //随机抽取0或1
        Random r=new Random();
        int index = r.nextInt(list.size());
        Integer number = list.get(index);
        System.out.println(number);

        //创建两个集合,分别存储男生女生的名字
        ArrayList<String>boyList=new ArrayList<>();
        ArrayList<String>girlList=new ArrayList<>();
        Collections.addAll(boyList,"a","b","c","d","e");
        Collections.addAll(girlList,"z","x","n","v","m");
        if (number==1){
            int boyIndex = r.nextInt(boyList.size());
            String name = boyList.get(boyIndex);
            System.out.println(name);
        }else {
            int girlIndex = r.nextInt(girlList.size());
            String name = girlList.get(girlIndex);
            System.out.println(name);
        }

    }
}
