package javaExperimental2;

import javax.imageio.stream.ImageInputStream;
import java.util.Scanner;

public class BankAccount {
    int account;
    int money;
    BankAccount(int account,int money){
        this.account=account;
        this.money=money;
    }
    void setAccount(int account){
        this.account=account;
    }
    void setMoney(int money){
        this.money=money;
    }
    int getAccount(){
        return this.account;
    }
    int getMoney(){
        return this.money;
    }
    void deposit(int account,int money){
        if(this.account!=account){
            System.out.println("账户输入错误");
            return;
        }

        else{
            this.money=this.money+money;
            System.out.println("存款成功");
        }
    }
    void withdrawMoney(int account,int money){
        if(this.account!=account){
            System.out.println("账户输入错误");
            return;
        }

        if(this.money<money){
            System.out.println("余额不足");
            return;
        }
        else{
            this.money=this.money-money;
            System.out.println("取款成功");
        }


    }

    public static void main(String[] args) {
        BankAccount ba=new BankAccount(299445935,10000);
        System.out.println("账户"+ba.account+"的余额为"+ba.money);
        Scanner sc=new Scanner(System.in);
        System.out.println("输入账户和存款金额");
        int a=sc.nextInt();
        int b=sc.nextInt();
        ba.deposit(a,b);
        System.out.println("账户"+ba.account+"的余额为"+ba.money);
        System.out.println("输入账户和取款金额");
        int c=sc.nextInt();
        int d=sc.nextInt();
        ba.withdrawMoney(c,d);
        System.out.println("账户"+ba.account+"的余额为"+ba.money);

    }
}
