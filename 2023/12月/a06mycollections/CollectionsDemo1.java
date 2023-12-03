package a06mycollections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo1 {

    public static void main(String[] args) {
        //addAll集合批量添加元素
        ArrayList<String>list=new ArrayList<>();
        Collections.addAll(list,"adf","saf","dsagag","AF","SVSAC","AFV","xed");
        System.out.println(list);

        //shuffle打乱
        Collections.shuffle(list);
        System.out.println(list);
    }

}
