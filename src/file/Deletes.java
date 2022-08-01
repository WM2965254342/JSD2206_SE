package file;

import java.io.File;

public class Deletes {
    public static void deletes(File file){
        if (file.isFile()){
            file.delete();
            System.out.println(file.getName()+"文件删除完毕");
        }else{
            File []files=file.listFiles();
            for(int i=0;i< files.length;i++){
                if(files[i].isFile()){
                    files[i].delete();
                    System.out.println(file.getName()+"文件删除完毕");
                }else {
                    deletes(files[i]);
                    System.out.println(file.getName()+"文件夹删除完毕");
                }
            }
            file.delete();
            System.out.println(file.getName()+"文件删除完毕");
        }
    }

    public static void main(String[] args) {
        File file=new File("aaa");
        deletes(file);
    }
}
