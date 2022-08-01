package io;

import java.io.Serializable;
import java.util.Arrays;

/**
 * 使用当前类测试对象流的序列化与反序列化
 *
 * JAVA BEAN定义规范  bean:豆子
 * 1:属性私有化
 * 2:为属性提供get set方法
 * 3:会有无参构造器
 * 4:实现序列化接口
 *
 *
 * 凡是需要进行序列化的类都必须实现Serializable接口，
 * 并且该类中所有引用类型的属性也要实现该（Serializable）接口
 */
public class Person implements Serializable {
    private String name;
    private int age;
    private String gender;
    /**
     * transient关键字，被该关键字修饰的属性序列化时值会被忽略
     * 忽略不必要的属性可以减少资源开销
     */
    private transient String[] otherInfo;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", otherInfo=" + Arrays.toString(otherInfo) +
                '}';
    }

    public Person() {

    }

    public Person(String name, int age, String gender, String[] otherInfo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.otherInfo = otherInfo;
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

    public String[] getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String[] otherInfo) {
        this.otherInfo = otherInfo;
    }
}
