package a01mystream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public class StreamDemo9 {
    //stream终结方法
    //void forEach   遍历
    //long Count    统计
    //toArray()    收集流中的数据转到数组中
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周正若", "赵敏", "张强", "张三丰");

        //Consumer的范型:表示流中数据的类型
        list.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {//s表示流里的每一个数据
                System.out.println(s);
            }
        });
        System.out.println("_________________________________");
        list.stream().forEach(s -> System.out.println(s));

        System.out.println("_________________________________");
        //long Count    统计
        long count = list.stream().count();
        System.out.println(count);

        System.out.println("_________________________________");
        //toArray()    收集流中的数据转到数组中
        //空参会转化为object类型
        Object[] arr1 = list.stream().toArray();
        System.out.println(Arrays.toString(arr1));
        System.out.println("___________________________");

        //IntFunction的泛型:具体类型的数组
        String[] arr = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {  //形参:流中数据的个数  apply的返回值:具体类型的数组
                return new String[value];//返回数组的大小和流中数据的个数相同
            }
        });
        System.out.println(Arrays.toString(arr));

        System.out.println("____________________________-");
        String[] arr2 = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(arr2));
    }
}
