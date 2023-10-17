package oop.interfaces;

public class Duck implements Fly, Swim{

    @Override
    public void canFly() {
        System.out.println("Утка летит");
    }

    @Override
    public void canSwim() {
        System.out.println("Утка плавает");
    }
}
