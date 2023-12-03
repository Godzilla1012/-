package a08test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test3 {
    //不重复点名
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        ArrayList<String>list2=new ArrayList<>();
        Collections.addAll(list,"a","b","c","d","e","f","g");
        Collections.shuffle(list);
        Random r=new Random();

        //外循环,表示轮数
        for (int i = 1; i <= 10; i++) {
            System.out.println("__________第"+i+"轮点名_____________");
            int size=list.size();
            //内循环:表示每一轮抽取的过程
            for (int j = 0; j <size; j++) {
                int index = r.nextInt(list.size());
                String name = list.remove(index);
                list2.add(name);
                System.out.println(name);
            }
            //此时第一轮点名结束,list为空,list2存了所有的名字
            list.addAll(list2);
            list2.clear();
        }

    }
}
