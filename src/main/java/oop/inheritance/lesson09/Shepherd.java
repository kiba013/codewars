package oop.inheritance.lesson09;

public class Shepherd extends Dog {

    public Shepherd() {
        super(32);
    }



    @Override
    public void run() {
        System.out.println("Собака бежит быстро!");
    }

    @Override
    public void breath() {

    }
}
