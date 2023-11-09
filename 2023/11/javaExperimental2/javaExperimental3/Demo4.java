package javaExperimental3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数组的长度");
        int m= sc.nextInt();
        System.out.println("请输入第二个数组的长度");
        int n=sc.nextInt();
        int[] nums1 =new int[100];
        int[] nums2 = new int[100];
        System.out.println("请输入第一个数组的数组元素");
        for (int i = 0; i < m; i++) {
            nums1[i]=sc.nextInt();
        }
        System.out.println("请输入第二个数组的数组元素");
        for (int i = 0; i < n; i++) {
            nums2[i]=sc.nextInt();
        }
        for (int i = n,j=0; j < m; i++,j++) {
            nums2[i]=nums1[j];
        }
        Arrays.sort(nums2);    //使数组正序
        for (int i = 100-m-n; i < nums2.length; i++) {
            System.out.print(nums2[i]+" ");
        }
    }
}