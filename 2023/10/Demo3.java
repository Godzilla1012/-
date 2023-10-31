package class1031;

public class Demo3 {
    static void demo(){
        try{
            throw new NullPointerException("demo1");

        }
        catch(NullPointerException e){
            System.out.println("caught inside method");
        }
        }

    public static void main(String[] args) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
        try {
            demo();

        }
        catch (NullPointerException ex){
            System.out.println("123");
        }
    }
}
