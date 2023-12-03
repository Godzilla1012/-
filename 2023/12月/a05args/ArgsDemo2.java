package a05args;

public class ArgsDemo2 {
    public static void main(String[] args) {
        //1可变参数只能写一个
        //2方法中除可变参数外还有别的形参,可变参数要写在最后面
        getsum(1,2,34,5,6,7,7,87,6,4,34,3);
    }
    public static int getsum(int a,int...args){
        return 0;
    }
}
