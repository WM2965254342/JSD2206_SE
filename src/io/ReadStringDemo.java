package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/*
    从文件中读取字符串
* */
public class ReadStringDemo {
    public static void main(String[] args) throws IOException {
        //将fos.txt文件中所有字符读取回来
        File file=new File("fos.txt");

        FileInputStream fis=new FileInputStream(file);
        byte[]data=new byte[(int) file.length()];
        fis.read(data);

        String line=new String(data, StandardCharsets.UTF_8);//将字节组转换为String,转换格式为UTF-8
        System.out.println(line);
        fis.close();
    }
}
