package com.dmzhg.xmlparser;

/**
 * @author dmzhg
 */
public class Language {
    private String name;
    private int age;

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

    @Override
    public String toString() {
        return "Language: Name = " + this.name + " Age = " + this.age;
    }
}