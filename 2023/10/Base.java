import java.util.Scanner;

abstract public class Base {
    double calculate(double a,double b){
        return a/b;
    }
    abstract double sum(double a,double b);
    abstract double avg(double a,double b);

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        Sub c=new Sub();
        double result=c.calculate(a,b);
        System.out.println("计算的结果为"+result);
    }
}
class Sub extends Base{
    double sum(double a,double b){
        return a+b;
    }
    double avg(double a,double b){
        return (a+b)/2;
    }
}