package io;

import java.io.*;

/**
    使用缓冲流完成文件的复制操作

    JAVA IO将流分为两类，节点流和处理流(过滤流)
    节点流也称为低级流，特点:是实际连接程序与另一端的流，负责实际读写字节数据的流
                        特点一定是建立在节点流基础上进行的！！！
    处理流也称为高级流，特点:不能独立存在，必须连接在其他流上，目的是当数据经过当前
                         流时对其进行操作简化我们的读写。

    实际开发中我们经常串联一组高级流最终到某个低级流上，读写数据可以以流水线式的加工
    处理完成复杂的读写。这个过程称为"流的连接"

    文件流就是典型的低级流，是实际连接程序与文件的流，负责读写文件数据

    缓冲流:java.io.BufferedInputStream和BufferedOutPutStream
    缓冲流是一对高级流 功能:可以提高读写效率
 */
public class CopyDemo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("image.jpg");
        /**
            缓冲流默认的构造器
            BufferedInputStream(InputStream in)
            内部开辟的字节数组长度为8kb

            BufferedInputSteam(InputStream in,int size)
            自行指定内部缓冲区(byte数组长度)
         */
        BufferedInputStream bis=new BufferedInputStream(fis);


        FileOutputStream fos=new FileOutputStream("image010.jpg");
        BufferedOutputStream bos=new BufferedOutputStream(fos);

        int d;
        long state=System.currentTimeMillis();
        /**
            缓冲字节输入流的read方法第一次调用是会一次性块读一组数据进入到内部的缓冲区，
            然后返回其中第一个字节。第二次调用时会直接将数组中第二个字节返回，知道所有字节均返回后，
            下次调用read方法会再次块读数据进入数组。
            因此缓冲流本质就是将我们的读写操作统一转换为块读写形式来保证读写效率
         */
        while ((d=bis.read())!=-1){
            bos.write(d);
        }
        System.out.println("写入完毕");
        long end=System.currentTimeMillis();
        System.out.println("耗时"+(end-state)+"毫秒");
        bis.close();
        bos.close();
    }
}
