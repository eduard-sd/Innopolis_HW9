package ru.sayakhov;

public abstract class Human implements CanRun, CanSwim {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("I`m "+name+", i can running");
    }

    @Override
    public void swim() {
        System.out.println("I`m "+name+", i can swimming");
    }
}
