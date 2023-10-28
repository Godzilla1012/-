package homework1026;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Integer i;
        i=sc.nextInt();
        System.out.println("绝对值为:"+Math.abs(i)+"\n平方根为:"+Math.sqrt(i)+"\n对数为:"+Math.log(i)+"\n正弦值为:"+Math.sin(i));
    }
}
