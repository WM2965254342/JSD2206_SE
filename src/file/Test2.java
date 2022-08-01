package file;

import java.io.File;
import java.io.FileFilter;

/*
    //获取./src/file目录中所有名字以"D"开始的文件
* */
public class Test2 {
    public static void main(String[] args) {
        File dir=new File("./src/file");
        if(dir.isDirectory()){
        FileFilter filter=new FileFilter() {
            public boolean accept(File pathname) {
                //只要file表示的文件的名字是以“D”开始的则接受
               String name= pathname.getName();
                System.out.println("正在过滤："+name);
                return name.startsWith("D");
            }
        };
            File[] subs= dir.listFiles(filter);
            for (int i = 0; i < subs.length; i++) {
                System.out.println(subs[i].getName());
            }
        }

    }
}
