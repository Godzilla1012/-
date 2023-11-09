package javaExperimental3;

import java.util.Scanner;

public class Demo2 {
    boolean isLengthTrue(String password){//判断密码长度是否在8-16之间
        if(password.length()>=8&&password.length()<=16)
            return true;
        else return false;
    }
    boolean isTure2(String password){//判断密码是否只包含字母和数字
        for (int i = 0; i < password.length(); i++) {
            if(!Character.isDigit(password.charAt(i))&&!Character.isLetter(password.charAt(i))){
                return false;
            }
        }
        return true;
    }
    boolean isTure3(String password){//判断密码是否存在至少2个数字
        int Count=0;
        for (int i = 0; i < password.length(); i++) {
            if(Character.isDigit(password.charAt(i))){
                Count++;
            }
        }
        if(Count>=2)
            return true;
        else
            return  false;
    }

    public static void main(String[] args) {
        String password;
        Scanner sc=new Scanner(System.in);
        password=sc.next();
        Demo2 d=new Demo2();
        if(d.isLengthTrue(password)&& d.isTure2(password)&& d.isTure3(password))
            System.out.println("valid password");
        else
            System.out.println("Invalid password");

    }
}
