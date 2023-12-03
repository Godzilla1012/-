package a05args;

public class ArgsDemo1 {
    public static void main(String[] args) {
        //可变参数
        //形参个数是变换的
        //格式:属性类型...名字
        //int...args
        int sum = getsum(1, 2, 3, 4, 5, 6, 6, 7);
        System.out.println(sum);
    }
    //底层:java会自己创建一个数组
    public static int getsum(int...args){
        int sum=0;
        for (int i = 0; i < args.length; i++) {
            sum=sum+i;
        }
        return sum;
    }
}
