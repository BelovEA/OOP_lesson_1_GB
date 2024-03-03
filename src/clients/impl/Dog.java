package clients.impl;

import clients.Animal;
import clients.Owner;

import java.time.LocalDate;

public abstract class Dog extends Animal {
    public Dog(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);

    }
}
