package ru.sayakhov;

public class Bird extends Animal implements CanFligth, CanSwim, CanRun{
    private int fligthSpeed;

    public Bird(String name, int age, int weigth, int fligthSpeed) {
        super(name, age, weigth);
        this.fligthSpeed = fligthSpeed;
    }

    public int getFligthSpeed() {
        return fligthSpeed;
    }

    public void setFligthSpeed(int fligthSpeed) {
        this.fligthSpeed = fligthSpeed;
    }

    @Override
    public void flight() {
        System.out.println("I`m "+name+", i can flying");
    }

    @Override
    public void swim() {
        System.out.println("I`m "+name+", i can swimming");
    }

    @Override
    public void run() {
        System.out.println("I`m "+name+", i can running");
    }
}
