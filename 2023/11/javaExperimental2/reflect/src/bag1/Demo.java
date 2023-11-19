package bag1;

public class Demo {
    int id;
    String name;
    double price;


    public Demo() {
    }

    public Demo(int id) {
        this.id = id;
    }

    private Demo(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}