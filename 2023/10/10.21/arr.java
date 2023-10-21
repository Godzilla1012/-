import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]arr=new int[6];

        for(int i=0;i<6;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for (int i = 0; i < 6; i++) {
            if(max<arr[i])
                max=arr[i];
            if(min>arr[i])
                min=arr[i];

        }
        System.out.println("最大值为"+max);
        System.out.println("最小值为"+min);
    }

}
