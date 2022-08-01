package file;

import java.io.File;

/*
    获取一个目录中的所有子项
* */
public class ListFilesDemo {
    public static void main(String[] args) {
        //获取当前目录下的所有子项
        File dir =new File(".");
        /*
            boolean ifFile()
            判断当前File对象表示的是否为一个文件
            boolean ifDirectory()
            判断当前File对象表示的是否为一个目录
        * */
        if(dir.isDirectory()){//判断当前dir表示的是否为一个目录
            /*
                File()listFiles()
                将当前File对象表示的目录中所有子项返回
            * */
            File[] subs = dir.listFiles();
            for (int i = 0; i < subs.length; i++) {
                File sub=subs[i];
                System.out.println(sub.getName());
            }
        }


    }
}
