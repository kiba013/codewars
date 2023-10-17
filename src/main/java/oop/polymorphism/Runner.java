package oop.polymorphism;

public class Runner {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        Animal[] animals = new Animal[2];

        animals[0] = dog;
        animals[1] = cat;
        for (Animal animal : animals) {
            animal.eat();
        }

    }
}