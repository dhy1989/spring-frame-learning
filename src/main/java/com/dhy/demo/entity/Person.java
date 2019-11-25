package com.dhy.demo.entity;

/**
 * @author dinghy
 * @date 2019/11/25
 */
public class Person {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name:"+name+" age:"+age;
    }
}
