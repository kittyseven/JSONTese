package com.example.liushiqian.jsontese;

/**
 * Created on  2017/2/21.
 * Author: LiuShiQian
 * Description: XXX
 */
public class TestJson {
    private String name;
    private int age;
    private int id;

    public TestJson() {
        super();
    }

    public TestJson(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
