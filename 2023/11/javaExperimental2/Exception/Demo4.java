package javaExperimental6;

import java.util.Arrays;
import java.util.Scanner;

public class Demo4{
    void Calculate(int[]n)throws MyException{
        if((n[0]+n[1])<=n[2]){
            throw new MyException("无法构成三角形");
        }
        else{
            float s=(n[0]+n[1]+n[2])/2;

            System.out.println("三角形的面积为"+Math.sqrt(s*(s-n[0])*(s-n[1])*(s-n[2])));
        }
    }

    public static void main(String[] args)  {
        Demo4 d=new Demo4();
        int[]n=new int [3];
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入三条边的值");
        for (int i = 0; i < 3; i++) {
            n[i]=sc.nextInt();
        }
        Arrays.sort(n);
        try{
            d.Calculate(n);
        } catch (MyException e) {
            System.out.println(e);
        }
    }
}
