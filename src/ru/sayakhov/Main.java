package ru.sayakhov;

public class Main {

    public static void main(String[] args) {

        Mammal bear = new Mammal("White bear",5,150,50);
        Bird duck = new Bird("Duck", 1,1,50);
        Amphibia bober = new Amphibia("Bober",2,5,10);

        bear.run();
        bear.swim();
        duck.flight();
        duck.flight();
        duck.run();
        bober.swim();
        bober.run();


        Human petia = new Adult("Peter","Programmer");
        Human kostia = new Kids("Kostia","122");

        System.out.println();
        petia.run();
        petia.swim();

        System.out.println();
        kostia.run();
        kostia.swim();
    }
}
