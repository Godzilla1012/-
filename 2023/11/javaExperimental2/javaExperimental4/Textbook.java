package javaExperimental4;

public  class Textbook implements Book{
    book1 book=new book1();
    @Override
    public void getBookName() {
        System.out.println(book.name);
    }

    @Override
    public void getAuthor() {
        System.out.println(book.author);
    }}