package a01mystream;

import java.util.Arrays;

public class StreamDemo4 {
    public static void main(String[] args) {
        //数组获取stream流  调用Arrays工具类中的方法
        int[]arr={1,2,3,4,5,6,7,8,9,10};
        String[]arr2={"1","2","c"};
        Arrays.stream(arr).forEach(s-> System.out.println(s));
    }
}
