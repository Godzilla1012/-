import java.util.Scanner;

class Person {
    int age;
    void setAge(int age){
        if(age>=0&&age<=200){
          this.age=age;
        }
        else if(age<0)
            this.age=0;
        else
            this.age=200;
    }
    int getAge(){
        return this.age;
    }
}
class Main{
    public static void main(String[] args) {
        Person p=new Person();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        p.setAge(a);
        p.getAge();
        System.out.println(p.age);
    }
}
