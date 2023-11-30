package javaExperimental6;

import java.util.Scanner;

class MyException extends Exception{
    MyException(String s){
        super(s);
    }
}
public class Demo2 {
    public void MaxDay(int day)throws MyException{
        if(day>30){
            throw new MyException("超过最大天数");

        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Demo2 d=new Demo2();
        System.out.println("请输入借阅的天数");
        int day=sc.nextInt();
        try{
            d.MaxDay(day);
        } catch (MyException e) {
            System.out.println(e);
        }

    }
}
