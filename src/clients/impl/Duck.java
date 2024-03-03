package clients.impl;

import clients.*;

import java.time.LocalDate;

public class Duck extends Animal implements Flyable, Swimable, Goable {

    public Duck(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
    }

    @Override
    public double fly() {
        return 2;
    }

    @Override
    public double swim() {
        return 10;
    }

    @Override
    public double walk() {
        return 5;
    }
}
