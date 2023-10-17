package oop.interfaces;

public class Runner {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Airplane airplane = new Airplane();
        Duck duck = new Duck();


        Swim[] pool = {fish, duck};
        Fly[] sky = {airplane, duck};

        for (Swim swim : pool) {
            swim.canSwim();
        }
        for (Fly fly : sky) {
            fly.canFly();
        }
    }
}
