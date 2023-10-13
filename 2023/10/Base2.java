import java.util.Scanner;
public class Base2 {
    protected int x;
    protected int y;

    public void setX(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public int sum() {

        return x + y;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        Base2 b = new Sub2();
        b.setX(x, y);
        int c = b.sum();
        System.out.println(c);
    }
}

class Sub2 extends Base2 {

    @Override
    public int sum() {
        return x * 10 + y;
    }
}