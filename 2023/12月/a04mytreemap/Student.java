package a04mytreemap;

import java.util.Objects;

public class Student implements Comparable<Student>{
    String name;
    int age;


    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }


    @Override
    public int compareTo(Student o) {
        //this:表示要添加的元素
        //o:表示红黑树中已存在的元素
        //返回值
        //负数,要添加的元素是小的,存左边
        //正数,存右边
        //0,已存在,舍弃
        int i=(this.getAge()-o.getAge());
        //如果年龄一样就比名字
        i=i==0?this.getName().compareTo(o.getName()):i;
        return i;
    }
}
