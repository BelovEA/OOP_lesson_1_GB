package clients;
//import java.time.LocalDate;

import java.time.LocalDate;

public class Animal {
    protected String name;
    protected float weight;
    protected LocalDate age;
    protected Owner owner;

    public Animal(String name, float weight, LocalDate age, Owner owner) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.owner = owner;
    }

    public Animal() {
        this("Животное", 100, LocalDate.now(), new Owner());
    }

    private void sleep() {
        System.out.println(getType()+ " Sleep");
    }

    private void wakeUp() {
        System.out.println(getType() + " Wake up");
    }

    private void wakeUp(int time) {
        System.out.println(getType() + " Wake up in " + time);
    }

    private void eat() {
        System.out.println(getType() + " eat");
    }

    private void play() {
        System.out.println(getType() + " play");
    }

    public void lifeCycle() {
        wakeUp(20);
        eat();
        play();
        sleep();
    }

    public String getType() {
        return getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public LocalDate getAge() {
        return age;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void toGO() {
        System.out.println("going");
    }

    public void fly() {
        System.out.println("flying");
    }

    public void swim() {
        System.out.println("swimming");
    }

    public String toString() {
        return String.format("name = %s, weight = %s, age = %s, owner = %s",
                name, weight, age, owner);
    }
}


