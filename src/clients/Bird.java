package clients;

import java.time.LocalDate;

public class Bird extends Animal{

    @Override
    public void swim() {
        System.out.println("I can't swim");
    }
    public Bird(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Bird() {
        fly();
        toGO();
    }
}
