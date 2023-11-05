import java.util.Scanner;

public class aver {
    float averCalute(int N)throws MyException{
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int num;
        for (int i = 0; i < N; i++) {
            System.out.println("请输入第"+(i+1)+"个数的值");
            num=sc.nextInt();
            if(num<0){
                throw new MyException("输入的值必须是正数或者0,请重新输入");
                //System.out.println("请重新输入第"+i+"个数的值");
              //  num=sc.nextInt();
            }
            sum=sum+num;
        }
        return sum/N;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数的个数");
        int N=sc.nextInt();
        int num;
        aver a=new aver();
        try{
            a.averCalute(N);
        }catch (MyException e){
            System.out.println(e);
        }


    }
}

