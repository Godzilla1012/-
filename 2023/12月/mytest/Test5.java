package mytest;

import java.io.*;

public class Test5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("g.txt"));
        String line=br.readLine();
        int count=Integer.parseInt(line);
        count++;
        if (count<=3){
            System.out.println("欢迎使用本软件,第"+count+"次使用免费");
        }else {
            System.out.println("本软件只能免费使用3次,注册会员后继续使用");
        }
        BufferedWriter bw=new BufferedWriter(new FileWriter("g.txt"));
        bw.write(count+"");
        bw.close();
        br.close();
    }
}
