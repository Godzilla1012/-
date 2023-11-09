package javaExperimental3;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String a=sc.next();               //输入两个二进制数
        String b=sc.next();
        int c=Integer.parseInt(a,2);  //将二进制转化为十进制
        int d=Integer.parseInt(b,2);
        int sum=c+d;                       //将十进制数相加
        String n=Integer.toBinaryString(sum);  //将二进制转化为十进制
        System.out.println(n);
    }
}
