package oop.interfaces;

public class Airplane implements Fly{

    @Override
    public void canFly() {
        System.out.println("Самолет летит");
    }
}
