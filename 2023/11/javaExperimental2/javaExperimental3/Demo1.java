package javaExperimental3;


import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        char arr[]={'a','d','m','z','h','c','o'};
       Arrays.sort(arr);  //升序排序
        for (int i = arr.length-1; i >=0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
