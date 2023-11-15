import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr[]=creatnum();          //生成中奖号码
        int[] userInputArr=userInputNumber();  //用户输入中奖号码
        int redCount=0,blueCount=0;
        for(int i=0;i< userInputArr.length-1;i++){
            int redNumber=userInputArr[i];
            for (int j = 0; j< arr.length;j++) {//将目前红球号码和奖池号码逐一比较
                if(redNumber==arr[j])
                    redCount++;
                break;
            }
        }
        if(userInputArr[userInputArr.length-1]==arr[arr.length-1])  //判断蓝球
            blueCount++;
        System.out.println("红球中了"+redCount+"  蓝球中了"+blueCount);

        if(redCount==6&&blueCount==1)
            System.out.println("中10000000");
        else if(redCount==6&&blueCount==0)
            System.out.println("中5000000");
        else if(redCount==5&&blueCount==1)
            System.out.println("中3000");
        else if(redCount==5&&blueCount==0||redCount==4&&blueCount==1)
            System.out.println("中200");
        else if(redCount==4&&blueCount==0||redCount==3&&blueCount==1)
            System.out.println("中10");
        else if(redCount==2&&blueCount==1||redCount==1&&blueCount==1||redCount==0&&blueCount==1)
            System.out.println("中5");
        else System.out.println("谢谢惠顾");

    }



    public static  int[]userInputNumber(){   //用户购买的彩票号码
        int[]arr=new int[7];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<6;){
            System.out.println("请输入第"+(i+1)+"个红色号码(1--33)");
            int redNumber=sc.nextInt();
            if(redNumber>=1&&redNumber<=33){
                boolean flag=contains(arr,redNumber);
                if(!flag){
                    arr[i]=redNumber;
                    i++;
                }else{
                    System.out.println("当前红球号码已存在,请重新输入");
                }
            }
            else{
                System.out.println("红球号码超出范围");
            }
        }

        System.out.println("请输入蓝球号码(0--16)");
        int blueNumber= sc.nextInt();
        if(blueNumber>=0&&blueNumber<=16){
            arr[arr.length-1]=blueNumber;
        }
        else{
            System.out.println("蓝球号码超出范围");
        }
        return arr;
    }
    public static int[] creatnum(){
        int[]arr=new int[7];
        Random r=new Random();
        for(int i=0;i<arr.length;){
            int redball=r.nextInt(33)+1;
            boolean flag=contains(arr,redball);
            if(flag==false){
                arr[i]=redball;
                i++;
            }
        }
        int blueball=r.nextInt(16)+1;
        arr[6]=blueball;
        return arr;
    }
    public static boolean contains(int arr[],int number){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==number)
                return true;
        }
        return false;
    }
}