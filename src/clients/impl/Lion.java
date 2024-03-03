package clients.impl;

import clients.Animal;
import clients.Goable;
import clients.Owner;
import clients.Swimable;

import java.time.LocalDate;

public class Lion extends Animal implements Goable, Swimable {
    public Lion(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("Lion eating");
    }

    @Override
    public double walk() {
        return 25;
    }

    @Override
    public double swim() {
        System.out.println("Lion swimming");
        return 10;
    }
}