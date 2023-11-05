import java.io.File;
import java.util.Scanner;


public class file {
    static int LettersLength(String s)throws MyException{
        File f=new File(s);
        if(!f.exists()){
            throw new MyException("文件不存在");
        }
        else{
            return (int) f.length();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int length;
        try {
            length=LettersLength(s);
            System.out.println("该文件中有"+length+"个英文字母");
        }catch (MyException e){
            System.out.println(e);
        }

    }
}
