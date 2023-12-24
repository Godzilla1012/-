package mytest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test3 {
    public static void main(String[] args) throws IOException {
        //将文件中的数排序2-1-9-4-7-8

        FileReader fr=new FileReader("c.txt");
        StringBuilder sb=new StringBuilder();
        int ch;
        //读取到sb中
        while((ch=fr.read())!=-1){
            sb.append((char)ch);
        }
        fr.close();
        System.out.println(sb);
//        //将sb转为string
//        String str=sb.toString();
//        //按-分割
//        String[] arrstr = str.split("-");
//
//        //存到列表中
//        ArrayList<Integer>list=new ArrayList<>();
//        for (String s : arrstr) {
//            int i = Integer.parseInt(s);
//            list.add(i);
//        }
//        Collections.sort(list);
//        System.out.println(list);
//        //从列表中读取到文件中
//        FileWriter fw=new FileWriter("c.txt");
//        for (int i = 0; i < list.size(); i++) {
//            if(i==list.size()-1){
//                fw.write(list.get(i)+"");//+""使之转化为str类型
//            }else{
//                fw.write(list.get(i)+"-");
//            }
//        }
//        fw.close();
        Integer[] arr = Arrays.stream(sb.toString().split("-"))
                .map(Integer::parseInt).sorted().toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr));

        String s = Arrays.toString(arr).replace(", ","-");
        String result = s.substring(1, s.length() - 1);
        System.out.println(result);
        FileWriter fw=new FileWriter("c.txt");
        fw.write(result);
        fw.close();
    }
}
