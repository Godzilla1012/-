package javaExperimental2;

public abstract class Item {
    abstract void checkOut(String book);
    abstract void checkIn(String book);
}

class Book extends Item{
   
    @Override
    void checkOut(String book) {
        System.out.println(book+"已被成功借出");
    }
    void checkIn(String book){
        System.out.println(book+"已被成功归还");
    }

}
class Magazine extends Item{

    @Override
    void checkOut(String book) {
        System.out.println(book+"已被成功借出");
    }
    void checkIn(String book){
        System.out.println(book+"已被成功归还");
    }

}
class  main{
    public static void main(String[] args) {
        Book book=new Book();
        Magazine magazine=new Magazine();
        book.checkOut("钢铁是怎样炼成的");
        magazine.checkIn("HUCCs");
    }
}