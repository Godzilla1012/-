package bag1;

import java.awt.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class main {
    public static void main(String[] args) {
        try {
            Class c=Class.forName("bag1.Demo");
            //Constructor对象代表构造方法,可利用Constructor访问构造方法
            Constructor cons[]=c.getDeclaredConstructors();  //获取构造方法
            for (Constructor con:cons){
                System.out.print(Modifier.toString(con.getModifiers())+" ");//获取修饰符
                System.out.print(con.getName()+"(");//获取方法名
                Class paras[]=con.getParameterTypes();//获取方法的参数
                for (int i = 0; i < paras.length; i++) {
                    System.out.print(paras[i].getSimpleName()+" args "); //获取参数名
                    if (i<paras.length-1){
                        System.out.print(",");
                    }
                }
                System.out.println("){ }");
                System.out.println();


            }
            Constructor cs1=c.getDeclaredConstructor();//无参数构造方法
            Object obj=cs1.newInstance();
            System.out.println(obj.toString());

            Constructor cs2=c.getDeclaredConstructor(int.class);//有参数构造方法
            obj=cs2.newInstance(123);
            System.out.println(obj.toString());

            Constructor cs3=c.getDeclaredConstructor(int.class,String.class,double.class);//无参数构造方法
            cs3.setAccessible(true);     //设置访问权限,可访问私有成员
            obj=cs3.newInstance(123,"反射",-1.1);
            System.out.println(obj.toString());


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
}
