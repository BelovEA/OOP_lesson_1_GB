import clients.Animal;
import clients.Dog;
import clients.Lion;
import clients.Bird;
import clients.Fish;
import clients.Owner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal leva = new Lion("Лева", 200, LocalDate.now(), new Owner());
        Lion puzo = new Lion("Кот", 35, LocalDate.now(), new Owner());
        Dog lila = new Dog("Лила", 21, LocalDate.now(), new Owner());
        Fish nemo = new Fish("Немо", 1, LocalDate.now(), new Owner());
        Bird kesha = new Bird("Кеша", 3, LocalDate.now(), new Owner());

        List<Animal> animals = new ArrayList<>();
        animals.add(puzo);
        animals.add(leva);
        animals.add(lila);
        animals.add(nemo);
        animals.add(kesha);
        System.out.println(animals);
    }

}