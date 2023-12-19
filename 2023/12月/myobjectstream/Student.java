package myobjectstream;

import java.io.Serial;
import java.io.Serializable;

public class Student implements Serializable {// Serializable没有抽象方法,标记型接口,使用后表示当前Student类可以被序列化,  //是一个物品的合格证
    @Serial
    private static final long serialVersionUID = 752330689361689776L;//定义版本号
    //定义版本号后在序列化后即使被修改也可以反序列化


    protected String name;
    private int age;
    private transient String address;//transient:不会把当前属性序列化到本地文件中

    public Student() {
    }

    public Student( String name, int age, String address) {

        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
