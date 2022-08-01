package homework.day03;

import java.io.Serializable;

class User implements Serializable {
    public static final long serialVersionUID = 42L;
    private String name;
    private int pwd;
    private String nick;
    private int age;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pwd=" + pwd +
                ", nick='" + nick + '\'' +
                ", age=" + age +
                '}';
    }

    public User(String name, int pwd, String nick, int age) {
        this.name = name;
        this.pwd = pwd;
        this.nick = nick;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPwd() {
        return pwd;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}