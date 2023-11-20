package javaExperimental4;
public  class Novel implements Book{
    novel1 novel=new novel1();
    @Override
    public void getBookName() {
        System.out.println(novel.name);
    }

    @Override
    public void getAuthor() {
        System.out.println(novel.author);
    }
}