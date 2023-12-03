package a08test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        //随机点名器
        ArrayList<String>list=new ArrayList<>();
        Collections.addAll(list,"a","b","c","d","e","f","g");
        Random r=new Random();
        int i = r.nextInt(list.size());
        String name= list.get(i);
        System.out.println(name);

        System.out.println("_____________");
        Collections.shuffle(list);
        System.out.println(list.get(0));
    }
}
