package me.ssagan.streamapp.entity;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("Name = ")
                .append(this.name)
                .append("; ")
                .append("Age = ")
                .append(this.age)
                .toString();
    }
}