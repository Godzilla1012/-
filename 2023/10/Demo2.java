package class1031;

public class Demo2 {
    public static void main(String[] args) {
        try {
            int a = 0;
           // int b = 2 / a;
            int c[] = {1, 2};
        }
        catch (Exception ex){

            System.out.println(ex.getLocalizedMessage());
    }
        finally {
            System.out.println("finally执行");
        }
}}

