import java.util.Scanner;

class MyException extends Exception {
    MyException(String ErrorMessage){
        super(ErrorMessage);//使用父类的构造函数，并将ErrorMessage作为参数传递给它
    }
}

public class Score {

    void isRightScore(int score)throws MyException{
        if(score<0||score>100){
            throw new MyException("分数不合法");
        }
    }
    public static void main(String[] args) {
        int score;
        Score s=new Score();
        Scanner sc=new Scanner(System.in);
        score=sc.nextInt();
        try{
            s.isRightScore(score);
        }catch (MyException e){
            System.out.println(e);          //输出异常信息
        }
    }
}