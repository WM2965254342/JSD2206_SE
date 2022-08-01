package file;

import java.io.File;
import java.io.IOException;

/*
    create:创建
    new:新
    file:文件

    使用File新建一个文件
* */
public class CreateNewFileDemo{
    public static void main(String[] args) throws IOException {
        //在当前项目目录下新建一个文件:test.txt
        //1.创建一个File表示要创建的文件
        File file=new File("./test.txt");
        //2.判断该位置下是否已经存在了这个文件或目录
        /*
            boolean exists(); 判断当前File表示的文件或目录是否真实存在，存在返回true,否则返回false
        * */
        if(file.exists()){//判断当前路径对应的位置是否有该文件
            System.out.println("该文件已存在");
        }else {
            //3.将该文件创建出来
            /*
                createNewFile(); 将当前File所表示的文件在该位置创建出来
            * */
            file.createNewFile();//光标在这句代码中按alt+回车
        }
    }

}
