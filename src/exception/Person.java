package exception;

/**
    异常的抛出
    使用throw关键字可以在一个方法中主动对外抛出一个异常给方法调用者解决
    通常下述情况我们会主动对外抛出异常:
    1:当前方法遇到一个异常,但是该异常不应当被当前方法处理时可以主动抛出给调用者
    2:程序可以正常运行,但是已经不满足该方法解决的实际业务问题时,可以将其当做一个
      错误抛出给调用者

    本案例演示的就是第二种情况
 */
public class Person {
    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAgeException {
        if(age<0||age>100){
            //主动实例化一个异常并使用throw关键字将其抛出到setAge方法外，由调用该方法的地方处理
//            throw new RuntimeException("年龄不合法");
           /* 通常我们使用throw抛出一个异常时就要在方法行使用throws声明该异常的抛出，除了RuntimeException
                剩下的异常都是必须的操作
            */
            throw new IllegalAgeException("年龄不合法");

        }
        this.age=age;
    }

    private int age;
}

/**
   异常的抛出
* */
 class ThrowDemo{
    public static void main(String[] args) {
        Person p=new Person();

            /**
             当我们调用一个含有throws声明异常抛出的方法时,编译器要求我们必须在调用该方法这里
             添加异常处理机制,处理方式有两个可选项
             1:主动使用try-catch捕获这个异常并处理
             2:在当前方法上继续使用throws声明该异常的抛出给上层调用者(这里比如在main方法上
             继续使用throws声明抛出)
             实际开发中选择那种取决于业务需求.
             */

        try {
            p.setAge(1000);//满足语法，但是不满足业务
        } catch (IllegalAgeException e) {
            e.printStackTrace();
        }

        System.out.println("此人年龄"+p.getAge()+"岁");
    }
}
