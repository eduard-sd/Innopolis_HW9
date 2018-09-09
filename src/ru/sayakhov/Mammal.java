package ru.sayakhov;

public class Mammal extends Animal implements CanRun,CanSwim{
    private int runSpeed;

    public Mammal(String name, int age, int weigth, int runSpeed) {
        super(name, age, weigth);
        this.runSpeed = runSpeed;
    }

    public int getRunSpeed() {
        return runSpeed;
    }

    public void setRunSpeed(int runSpeed) {
        this.runSpeed = runSpeed;
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
