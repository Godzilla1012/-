package javaExperimental3;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for (int i = 0,j=s.length()-1; i < s.length()/2; i++,j--) {
            if(s.charAt(i)!=s.charAt(j))//如果第i个字符不等于倒数第i个字符,则不是回文
            {
                System.out.println(s+"不是回文");
                return;
            }

        }
        System.out.println(s+"是回文");
    }
}
