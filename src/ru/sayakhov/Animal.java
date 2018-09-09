package ru.sayakhov;

public abstract class Animal {
    protected String name;
    private int age;
    private int weigth;


    public Animal(String name, int age, int weigth) {
        this.name = name;
        this.age = age;
        this.weigth = weigth;
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

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }
}
