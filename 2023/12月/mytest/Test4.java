package mytest;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Test4 {
    public static void main(String[] args) throws IOException {
        //将文本按序号排序
        BufferedReader br=new BufferedReader(new FileReader("f.txt"));

        String line;
        ArrayList<String>list=new ArrayList<>();
        while((line=br.readLine())!=null){
            list.add(line);
        }
        list.sort((o1, o2) -> Integer.parseInt(o1.split("\\.")[0])-Integer.parseInt(o2.split("\\.")[0]));
//        list.sort(new Comparator<String>() {
//
//            @Override
//            public int compare(String o1, String o2) {
//                String s1 = o1.split("\\.")[0];
//                String s2 = o2.split("\\.")[0];
//
//                return Integer.parseInt(s1)-Integer.parseInt(s2);
//            }
//        });
        System.out.println(list);
        BufferedWriter wr=new BufferedWriter(new FileWriter("f.txt"));
        for (String s : list) {
            wr.write(s);
            wr.newLine();
        }
        wr.close();
    }
}
