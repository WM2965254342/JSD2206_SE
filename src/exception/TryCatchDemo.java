package exception;

/**
    JAVA异常处理机制
    JAVA中所有的异常的顶级超类为:Throwable


    异常处理机制中的:try-catch
    语法:
    try{
        可能出现异常的代码片段
    }catch(XXXException e){
        处理try中出现XXXException的代码
    }
 */
public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try{//try语句块不能单独写，后面必须跟上catch或finally块
//            String str=null;
//            System.out.println(str.length());//JAM会实例化对应异常抛出
            String str1="";
            System.out.println(str1.charAt(0));
            //try语句块中如果某句代码出现了异常，那么其后的所有代码均不执行！！！！
            System.out.println("!!!!!!!!!!!!!!");

            //当try语句块中几个异常有相同的处理方式时，我们可以合并到一个catch解决
        }catch (NullPointerException|StringIndexOutOfBoundsException e){
            System.out.println("出现空指针或字符串下标越界并解决了");
        }
        System.out.println("程序结束了");
    }
}
