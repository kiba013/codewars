package oop.inheritance.lesson09;

public class Poodle extends Dog{

    public Poodle() {
        super(28);
    }

    @Override
    public void run() {
        System.out.println("Собака бежит медленно!");
    }

    @Override
    public void breath() {

    }
}
