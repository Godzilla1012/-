package javaExperimental4;

interface Biology{
    abstract void breath();
}
interface Animal extends Biology{
    abstract void move();
    abstract void eat();
}
interface Mankind extends Animal{
    abstract void study();
    abstract void think();
}
public class NormalMan implements Mankind{
    private String name;
    public NormalMan() {
    }
    public NormalMan(String name) {
        this.name = name;
    }

    @Override
    public void breath() {
        System.out.println("breath");
    }

    @Override
    public void move() {
        System.out.println("move");
    }

    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void study() {
        System.out.println("study");
    }

    @Override
    public void think() {
        System.out.println("think");
    }

    public static void main(String[] args) {
        NormalMan normalMan=new NormalMan("qwe");
        normalMan.breath();
        normalMan.eat();
        normalMan.move();
    }
}
