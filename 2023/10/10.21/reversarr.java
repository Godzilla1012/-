import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class reversarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < 6; i++) {
            if (max < arr[i])
                max = arr[i];
            if (min > arr[i])
                min = arr[i];

        }
        System.out.println("最大值为" + max);
        System.out.println("最小值为" + min);
        int left = 0, right = arr.length - 1, temp;
        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        String s = Arrays.toString(arr);
        System.out.println("逆置后的数组为" + s);
//        int arr[][]=new int[3][3];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                arr[i][j]=sc.nextInt();
//            }
//        }
//        int sum=0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                sum=sum+arr[i][j];
//            }
//        }
//        System.out.println("二维数组每一项的和为"+sum);
//    }
    }
}
