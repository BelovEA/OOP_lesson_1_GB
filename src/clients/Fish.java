package clients;

import java.time.LocalDate;

public class Fish extends Animal{
    @Override
    public void toGO() {
        System.out.println("swimming");
    }

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }

    public Fish(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Fish() {
        swim();
    }
}
