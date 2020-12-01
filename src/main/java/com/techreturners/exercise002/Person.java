package com.techreturners.exercise002;

public class Person {
    private String name;
    private String profession;
    private String location;
    private int age;

    public Person(String name, String profession, String location, int age) {
        this.name = name;
        this.profession = profession;
        this.location = location;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }

    public String getLocation() {
        return location;
    }

    public int getAge() {
        return age;
    }
}