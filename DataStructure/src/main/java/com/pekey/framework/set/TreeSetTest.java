package com.pekey.framework.set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * TreeSet 为有序不重复集合
 * <li>采用<b>红-黑树</b>实现逻辑</li>
 * <li>红黑树是一种特定类型的二叉树</li>
 * 实现排序有限制条件： <br />
 * <p>
 * 方式一：元素自身具备比较性
 * <p>元素自身具备比较性，需要元素实现Comparable接口，重写compareTo方法，也就是让元素自身具备比较性，
 * 这种方式叫做元素的自然排序也叫做默认排序。</p>
 * <p>
 * 方式二：容器具备比较性
 * <p>
 * <p>当元素自身不具备比较性，或者自身具备的比较性不是所需要的。那么此时可以让容器自身具备。
 * 需要定义一个类实现接口Comparator，重写compare方法，并将该接口的子类实例对象作为参数传递给TreeMap集合的构造方法。</p>
 *
 * 注意：当Comparable比较方式和Comparator比较方式同时存在时，以Comparator的比较方式为主；
 */
public class TreeSetTest {

    public static void main(String[] args) {

        // Comparable 方式实现比较
        TreeSet ts = new TreeSet();
        ts.add(new Person1("aa", 20, "男"));
        ts.add(new Person1("bb", 18, "女"));
        ts.add(new Person1("cc", 17, "男"));
        ts.add(new Person1("dd", 17, "女"));
        ts.add(new Person1("dd", 15, "女"));
        ts.add(new Person1("dd", 15, "女"));


        System.out.println(ts);
        System.out.println(ts.size()); // 5

        //Comparator 方式实现比较方法
        TreeSet books = new TreeSet(new MyComparator());
        books.add(new Book("think in java", 100));
        books.add(new Book("java 核心技术", 75));
        books.add(new Book("现代操作系统", 50));
        books.add(new Book("java就业教程", 35));
        books.add(new Book("think in java", 100));
        books.add(new Book("ccc in java", 100));

        System.out.println(books);

    }
}

class Person1 implements Comparable {
    private String name;
    private int age;
    private String gender;

    public Person1() {

    }

    public Person1(String name, int age, String gender) {

        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age * 37;
    }

    public boolean equals(Object obj) {
        System.err.println(this + "equals :" + obj);
        if (!(obj instanceof Person)) {
            return false;
        }
        Person1 p = (Person1) obj;
        return this.name.equals(p.name) && this.age == p.age;

    }

    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", gender=" + gender
                + "]";
    }

    @Override
    public int compareTo(Object obj) {

        Person1 p = (Person1) obj;
        System.out.println(this + " compareTo:" + p);
        if (this.age > p.age) {
            return 1;
        }
        if (this.age < p.age) {
            return -1;
        }
        return this.name.compareTo(p.name);
    }

}

class MyComparator implements Comparator {

    public int compare(Object o1, Object o2) {
        Book b1 = (Book) o1;
        Book b2 = (Book) o2;
        System.out.println(b1+" comparator "+b2);
        if (b1.getPrice() > b2.getPrice()) {
            return 1;
        }
        if (b1.getPrice() < b2.getPrice()) {
            return -1;
        }
        return b1.getName().compareTo(b2.getName());
    }

}

class Book {
    private String name;
    private double price;

    public Book() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Book(String name, double price) {

        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book [name=" + name + ", price=" + price + "]";
    }

}
