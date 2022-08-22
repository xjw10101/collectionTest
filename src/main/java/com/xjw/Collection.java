package main.java.com.xjw;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Collection {
    //java.util.Collection
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();

        Vector<Object> vector = new Vector<>();

        Vector<Object> vector1 = new Vector<>(10, 10);

        vector.add("33");

        //添加元素
        list.add(10);  //因为集合只能存放引用类型，这里实际上是 list.add(new Integer(10))
        list.add("hello");
        list.add(true);

        //System.out.println(list);
        list.remove(2);  //删除第三个元素

        list.contains("hello");
        list.clear();
        //System.out.println(list);
        Student student = new Student("小小", 25);
        Student student1 = new Student("大大", 30);
        Student student2 = new Student("小bai", 28);
        Student student3 = new Student("小可爱", 21);
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        sort(list);
        System.out.println(list);


    }

    //复习以下冒泡排序
    public static void sort(List list){
        int size = list.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size -1 -i; j++) {
                Student student = (Student) list.get(j);
                Student student1 = (Student)list.get(j + 1);
                if (student.getAge() > student1.getAge()){
                    list.set(j,student1);
                    list.set(j + 1,student);
                }
            }
        }
    }
}


class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
