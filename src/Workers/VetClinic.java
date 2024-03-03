package Workers;

import clients.Animal;
import clients.Flyable;
import clients.Goable;
import clients.Swimable;

import java.util.ArrayList;
import java.util.List;

public class VetClinic {
    protected String clinicName;
    private List<Workers> Personall = new ArrayList<>();
    private List<Animal> Illanimals = new ArrayList<>();

    public VetClinic(String clinicName) {
        this.clinicName = clinicName;
        this.Illanimals = new ArrayList<>();
        this.Personall = new ArrayList<>();
    }

    public void addAnimal(Animal animal){
        Illanimals.add(animal);
    }
    public void addPersonall(Workers worker){
        Personall.add(worker);
    }
    public void removeAnimal(Animal animal){
        Illanimals.remove(animal);
    }
    public void removePersonall(Workers worker){
        Personall.remove(worker);
    }
    public List<Animal> getIllFlyable(){
        List<Animal> flyable = new ArrayList<>();
        for (Animal animal : Illanimals){
            if (animal instanceof Flyable){
                flyable.add(animal);
            }
        }
        return flyable;
    }
    public List<Animal> getIllSwimmable(){
        List<Animal> swimmable = new ArrayList<>();
        for (Animal animal : Illanimals){
            if (animal instanceof Swimable){
                swimmable.add(animal);
            }
        }
        return swimmable;
    }
    public List<Animal> getIllGoable(){
        List<Animal> goable = new ArrayList<>();
        for (Animal animal : Illanimals){
            if (animal instanceof Goable){
                goable.add(animal);
            }
        }
        return goable;
    }
    public List<Workers> getPersonall(){
        return Personall;
    }
    public double getSalary(Workers worker){
        return worker.getSalary();
    }
    public void setSalary(Workers worker, double salary){
        worker.setSalary(salary);
    }
}