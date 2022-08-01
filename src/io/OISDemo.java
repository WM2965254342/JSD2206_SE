package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 使用对象输入流完成对象的反序列化操作
 */
public class OISDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //将person.obj文件中的对象反序列化
        FileInputStream fis=new FileInputStream("person.obj");
        ObjectInputStream ois=new ObjectInputStream(fis);
        /**
            对象输入流提供了反序列化的方法
            Object readObject()
            该方法内部会通过对象输入流的流现将字节读取过来，然后将这些字节还原为java对象
            后返回，返回时统一以Object形式返回
         */
        Object obj= ois.readObject();
        Person person=(Person) obj;
        System.out.println(person);

        ois.close();
    }
}
