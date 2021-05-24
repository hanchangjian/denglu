package com.heima;

public class user {
    public String name;
    public String pass;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "user{" + "name='" + name + '\'' + ", pass='" + pass + '\'' + ", age=" + age + '}';
    }

    public user(String name, String pass, int age) {
        this.name = name;
        this.pass = pass;
        this.age = age;
    }

}
