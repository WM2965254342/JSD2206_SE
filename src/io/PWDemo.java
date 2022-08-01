package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
/**
 * 缓冲字符流
 * java.io.BufferedWriter和BufferedReader
 * 缓冲字符流是一对高级流，内部默认维护一个8k长度的char数组，读写一定是转换为块读写
 * 来保证效率
 *
 * java.io.PrintWriter是具有自动行刷新的缓冲字符输出流(内部总是连接着BufferedWriter作为缓冲加速部分)。
 * 而PW自身的特点是可以按行写出字符串且具有自动行刷新功能。
 */
public class PWDemo {
    public static void main(String[] args) throws FileNotFoundException {
        //向文件pw.txt中写入文本数据
        /*
            PrintWriter提供了直接对文件做操作的构造器
            PrintWriter(File file);
            PrintWriter(String path);
        * */
        PrintWriter pw=new PrintWriter("pw.txt");

        pw.println("素笔勾勒出青花，笔锋浓转淡");
        pw.println("瓶身描绘的牡丹，一如你初妆");
        System.out.println("写出完毕");
        pw.close();
    }
}
