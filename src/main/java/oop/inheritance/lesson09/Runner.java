package oop.inheritance.lesson09;

public class Runner {
    public static void main(String[] args) {


        Poodle poodle = new Poodle();
        poodle.bark();
        poodle.run();
        int countTeeth = poodle.countTeeth;
        System.out.println(countTeeth);

        Shepherd shepherd = new Shepherd();
        shepherd.bark();
        shepherd.run();
    }
}
