package oop.inheritance.lesson09;

public abstract class Dog extends Alive{

    public int countLeg = 4;
    public int countTeeth;

    public Dog(int countTeeth) {
        this.countTeeth = countTeeth;
    }

    public void bark() {
        System.out.println("Собака лает!");
    }

    public abstract void run();

}
