package javaExperimental6;

import java.util.Scanner;

class  CartFullException extends Exception{
    CartFullException(String s){
        super(s);
    }
}

public class ShoppingCart {
    int Capity=5;
    String[]s=new String[5];
    int i=0;
    public void addItem()throws Exception{
        System.out.println("添加第"+(i+1)+"个商品");
        Scanner sc=new Scanner(System.in);

        String x=sc.next();
        if (i>=Capity){
            throw new CartFullException("商品数已达最大容量");
        }
        s[i]=x;
        i++;
    }

    public static void main(String[] args) {
        ShoppingCart shoppingCart=new ShoppingCart();
        try{
            while(true){
                    shoppingCart.addItem();
            }

        } catch (CartFullException e) {
            System.out.println(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
