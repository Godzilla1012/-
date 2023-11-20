package javaExperimental4;

class book1{
    String name="三国演义";
    String author="罗贯中";
}
class novel1{
    String name="斗罗大陆";
    String author="唐三";
}
public class Demo3 {
    public static void main(String[] args) {
        Novel novel=new Novel();
        Textbook textbook=new Textbook();
        novel.getBookName();
        novel.getAuthor();
        textbook.getBookName();
        textbook.getAuthor();

    }


}
