package lambda;

import java.io.File;
import java.util.Arrays;

/*
    用lambda表达式创建文件过滤器
    获取当前项目目录下名字中含有字母o的所有子项
* */
public class Test {
    public static void main(String[] args) {
        File file=new File(".");
        if(file.exists()){
        File[] subs=file.listFiles(pathname -> pathname.getName().contains("o"));
            for (int i = 0; i < subs.length; i++) {
            System.out.println(subs[i].getName());
            }
        }
    }
}
