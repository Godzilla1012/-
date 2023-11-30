package javaExperimental6;

import java.util.Scanner;

public class Demo3 {
    public void min(int n)throws MyException{
        if(n<0){
            throw new MyException("人数为负值,不合理");
        }
        else{
            System.out.println("登记人数:"+n);
        }
    }

    public static void main(String[] args) {
        Demo3 d=new Demo3();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入人数");
        int num=sc.nextInt();

        try{
            d.min(num);
        } catch (MyException e) {
            System.out.println(e);
        }finally {
            System.out.println("本次登记操作结束");
        }
    }
}
