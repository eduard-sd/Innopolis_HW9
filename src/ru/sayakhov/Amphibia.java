package ru.sayakhov;

public class Amphibia extends Animal implements CanSwim, CanRun {
    private int swimSpeed;

    public Amphibia(String name, int age, int weigth, int swimSpeed) {
        super(name, age, weigth);
        this.swimSpeed = swimSpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    @Override
    public void swim() {
        System.out.println("I`m "+super.getName()+", i can swimming");
    }

    @Override
    public void run() {
        System.out.println("I`m "+super.getName()+", i can running");
    }
}
