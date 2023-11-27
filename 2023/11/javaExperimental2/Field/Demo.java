package Field;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class Demo {
    public static void main(String[] args) {
        Class c= null;
        try {
            c = Class.forName("Field.Example");
            Field fs[]=c.getDeclaredFields();//返回所有属性
            for (Field f:fs){
                System.out.print(Modifier.toString(f.getModifiers())+" ");
                System.out.print(f.getType().getSimpleName()+" ");//获取类型
                System.out.println(f.getName());//获取类型
            }


            Constructor cs=c.getConstructor();
            Example e=(Example) cs.newInstance();
            Field f=c.getDeclaredField("price");
            f.setAccessible(true);//修改访问权限
            System.out.println(f.get(e));
            f.set(e,3.14);      //修改属性值
            System.out.println(f.get(e));


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
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }

    }
}
