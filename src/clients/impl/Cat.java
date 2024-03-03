package clients.impl;

import clients.Animal;
import clients.Owner;
import clients.Goable;

import java.time.LocalDate;

public abstract class Cat extends Animal implements Goable {
    public Cat(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("Cat eats");
    }

    public void CatLifeCycle() {
        meow();
        walk();
    }

    private void meow() {
        System.out.println(getType() + " Meow");
    }
    @Override
    public double walk(){
        return 10;
    }
}
